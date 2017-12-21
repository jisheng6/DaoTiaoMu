package com.bawei.daotiaomu;

/**
 * Created by Adminjs on 2017/12/21.
 */

public class MainPresenter{
    private MaView view;
    private MoldelImpl moldel;
    public MainPresenter(MaView view) {
        this.view = view;
        this.moldel = new MoldelImpl();
    }

    public void get(){
        moldel.getData(new MoldelImpl.ModelCallBack() {
            @Override
            public void success(Bean bean) {
                if(view != null){
                    view.success(bean);
                }
            }
        });
    }
}
