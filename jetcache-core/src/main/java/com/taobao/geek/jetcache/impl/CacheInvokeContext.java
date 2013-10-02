/**
 * Created on  13-10-02 16:10
 */
package com.taobao.geek.jetcache.impl;

import com.taobao.geek.jetcache.CacheConfig;
import com.taobao.geek.jetcache.CacheProviderFactory;
import com.taobao.geek.jetcache.CacheResultCode;

import java.lang.reflect.Method;

/**
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
class CacheInvokeContext {
    Invoker invoker;
    Object src;
    Method method;
    Object[] args;
    CacheProviderFactory cacheProviderFactory;
    CacheConfig cacheConfig;

    //status, without getter and setter
    boolean needUpdateLocal = false;
    boolean needUpdateRemote = false;
    CacheResultCode localResult = null;
    CacheResultCode remoteResult = null;
    Object result = null;//this property has getter and setter

    public Invoker getInvoker() {
        return invoker;
    }

    public void setInvoker(Invoker invoker) {
        this.invoker = invoker;
    }

    public Object getSrc() {
        return src;
    }

    public void setSrc(Object src) {
        this.src = src;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public CacheProviderFactory getCacheProviderFactory() {
        return cacheProviderFactory;
    }

    public void setCacheProviderFactory(CacheProviderFactory cacheProviderFactory) {
        this.cacheProviderFactory = cacheProviderFactory;
    }

    public CacheConfig getCacheConfig() {
        return cacheConfig;
    }

    public void setCacheConfig(CacheConfig cacheConfig) {
        this.cacheConfig = cacheConfig;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}