package defpackage;

import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yd4  reason: default package */
/* loaded from: classes3.dex */
public final class yd4 {
    public final boolean a;
    public final boolean b;
    public final hn8 c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map h;

    public yd4(boolean z, boolean z2, hn8 hn8Var, Long l, Long l2, Long l3, Long l4, Map map) {
        map.getClass();
        this.a = z;
        this.b = z2;
        this.c = hn8Var;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = o17.y(map);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.d;
        if (l != null) {
            arrayList.add("byteCount=" + l.longValue());
        }
        Long l2 = this.e;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2.longValue());
        }
        Long l3 = this.f;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3.longValue());
        }
        Long l4 = this.g;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4.longValue());
        }
        Map map = this.h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return sl1.i0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ yd4(boolean z, boolean z2, hn8 hn8Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, hn8Var, l, l2, l3, l4, ls3.a);
    }
}
