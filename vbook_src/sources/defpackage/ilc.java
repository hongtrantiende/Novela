package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ilc  reason: default package */
/* loaded from: classes3.dex */
public final class ilc {
    public final boolean a;
    public final Map b;
    public final Map c;

    public ilc(boolean z, Map map, Map map2) {
        map.getClass();
        map2.getClass();
        this.a = z;
        this.b = map;
        this.c = map2;
    }

    public final Map a(String str) {
        Map map = (Map) this.b.get(str);
        if (map == null) {
            return ls3.a;
        }
        return map;
    }
}
