
package com.blitzmobileapps.reactnativemultithread;

import com.facebook.react.bridge.Callback;

class BgThread extends Thread implements Runnable{
    Callback callback;
    public BgThread(Callback cb){
            this.callback = cb;
    }
    @Override
    public void run() {

        this.callback.invoke();
    }
}
