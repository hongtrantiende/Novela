package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ss5  reason: default package */
/* loaded from: classes.dex */
public class ss5 extends hs5 {
    @Override // defpackage.hs5
    /* renamed from: f */
    public ss5 a(Object obj) {
        obj.getClass();
        b(obj);
        return this;
    }

    public ts5 g() {
        int i = this.b;
        if (i != 0) {
            Object[] objArr = this.a;
            if (i != 1) {
                ts5 i2 = ts5.i(i, objArr);
                this.b = i2.size();
                this.c = true;
                return i2;
            }
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            int i3 = ts5.c;
            return new xma(obj);
        }
        int i4 = ts5.c;
        return tm9.F;
    }
}
