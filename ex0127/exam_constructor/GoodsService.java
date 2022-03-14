/**
   ��ǰ�� ���� CRUD�۾� : B/L
    : ��ü�˻�, ���, ����, ����......

*/
class GoodsService{
	private Goods [] goodsArr = new Goods [10];

	static int count ;//�迭�� Goods�� ����� ������ üũ!!!
	
	/**String [] [] data = new String [] [] {
			{"A01","�����","2500","¥�� ����ϴ�"},
			{"A02","��Ĩ","1500","����ϴ�"},
			{"A03","��Ϲ���Ĩ","3500","�ް� ¥�� ������"},
			{"A04","���ڱ�","1800","������ ��"},
			{"A05","������","3000","������ ��"},
		};
		*/
	

	/**
		�ʱ�ġ �����͸� �����ϴ� �޼ҵ� �ۼ�
	*/
			public GoodsService(String [] [] data){
			for(int i=0 ; i < data.length ; i++){
				goodsArr[i] = this.create(data[i]);
				GoodsService.count++;
			}
		}

	 /**
		Goods�� �����ϼ� �������ִ� �޼ҵ� �ۼ�
	 */
	private Goods create(String [] row){
		Goods goods = new Goods (row[0],row[1],Integer.parseInt(row[2]),row[3] );

		return goods;
	}
    /**
	   ����ϱ�
	     : ������� ��ǰ�ڵ尡 �ߺ������� üũ�ؼ� �ߺ��� �ƴҶ� ����Ѵ�. 

		@return : int��
		  ( 0�̸� ��ǰ�ڵ��ߺ�, 
		    1�̸� ��� ����, 
		    -1�̸� �迭�� ���̸� ����� ��Ͼȵ�) 
	*/
		public int insert(Goods goods){//��ǰ�ڵ�, ��ǰ�̸�, ����, ����
		if(goodsArr.length == GoodsService.count){
			return -1;		
		}



		//�ߺ�üũ
		//�μ��� ���޵� ��ǰ�ڵ尡 �̹������ Goods �迭�ȿ� �����ϴ��� üũ�ؾ��Ѵ�.
		String code = goods.getCode();
		Goods g = this.selectByCode(code);


		if(g != null){
			return 0;
		}


		//�ߺ��ƴϸ� ���
		goodsArr[GoodsService.count] = goods;

		GoodsService.count++;

        return 1;
	}
   

	/**
	  ��ü�˻�
	   @return : GoodsŸ���� �迭(�迭�̸� �ϳ��� �������� ��ǰ�� ��Ƽ� ����)
	*/
    public  Goods[] selectAll(){
		

          return goodsArr;
	}


	/**
	  ��ǰ�ڵ忡 �ش����ϴ� ��ǰ�˻�
	   return : ���� �μ��� ���޵� code�� �ش��ϴ� ������ ������ Goods����ƾ�ϰ�
	            ������ null�� �����Ѵ�. 
	*/
    public Goods selectByCode(String code){

			for(int i = 0 ; i< GoodsService.count ; i++){
			Goods goods = goodsArr[i];
			/*if(goods.getCode().equals(code)){ //������ ã�Ҵ� �ִ�.
				return goods;
			}*/

			//code�� ��ҹ��� �������� �ʰ�ʹ�.
			String upperCode = goods.getCode().toUpperCase();//toLowerCase()
			code = code.toUpperCase();

			if(upperCode.equals (code)){
				return goods;
			}
		}


          return null;
	}


	/**
	  ��ǰ�ڵ忡 �ش��ϴ� ��ǰ����, ���� �����ϱ� 
	  @return : boolean���� �����̿Ϸ�Ǹ� true, �ƴϸ� false
	*/
	public boolean update(Goods goods){ //��ǰ�ڵ�, ����, ����
		// ������ �Ϸ��� �迭�濡 ����Ǿ� �ִ� ��ǰ�ڵ忡 �ش��ϴ� Goods�� ã�� ������ �����Ѵ�.

		Goods dbGoods = this.selectByCode(goods.getCode() );//�����ö� get �����Ҷ� set
		if(dbGoods != null){//ã�Ҵ�, �����Ѵ�!!
			//���޵� ������ ����� ���� �����Ѵ�.

			dbGoods.setPrice( goods.getPrice() );
			dbGoods.setExplain(goods.getExplain());
			return true;
		}

        return false;
	}
}