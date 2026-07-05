package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jfc  reason: default package */
/* loaded from: classes3.dex */
public final class jfc {
    public final double a;
    public final double b;
    public final HashMap c = new HashMap();

    public jfc(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double a(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.c;
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = Double.valueOf(rqe.i(this.a, 200.0d, i).c);
            hashMap.put(valueOf, obj);
        }
        return ((Number) obj).doubleValue();
    }
}
