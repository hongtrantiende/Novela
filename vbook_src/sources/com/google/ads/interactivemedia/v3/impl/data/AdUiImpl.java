package com.google.ads.interactivemedia.v3.impl.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class AdUiImpl {
    private final List<fxd> icons;
    private final zce router;
    private final String sessionId;

    public AdUiImpl(zce zceVar, List<fxd> list, String str) {
        this.icons = list;
        this.sessionId = str;
    }

    private Map<String, Object> createIconData(fxd fxdVar) {
        ape.z(1, "expectedSize");
        HashMap hashMap = new HashMap(2);
        hashMap.put("id", Integer.valueOf(fxdVar.getId()));
        return hashMap;
    }

    public List<fxd> getIcons() {
        return this.icons;
    }

    public void iconClicked(fxd fxdVar) {
        createIconData(fxdVar);
        throw null;
    }

    public void iconShown(fxd fxdVar) {
        createIconData(fxdVar);
        throw null;
    }
}
