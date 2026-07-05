package org.chromium.net;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class ProxyOptions {
    private final List<Proxy> mProxyList;

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public @interface Experimental {
    }

    public ProxyOptions(List<Proxy> list) {
        Objects.requireNonNull(list);
        if (!list.isEmpty()) {
            int indexOf = list.indexOf(null);
            if (indexOf != -1 && indexOf != list.size() - 1) {
                vs.m("Null is allowed only as the last element in the proxy list");
                throw null;
            } else {
                this.mProxyList = new ArrayList(list);
                return;
            }
        }
        vs.m("ProxyList cannot be empty");
        throw null;
    }

    public List<Proxy> getProxyList() {
        return Collections.unmodifiableList(this.mProxyList);
    }
}
