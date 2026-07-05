package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jxc  reason: default package */
/* loaded from: classes3.dex */
public abstract class jxc implements bc4 {
    public final hxc a;
    public final int b;
    public final Integer c;
    public final int d;

    public jxc(hxc hxcVar, int i, Integer num) {
        hxcVar.getClass();
        this.a = hxcVar;
        this.b = i;
        this.c = num;
        int i2 = hxcVar.e;
        this.d = i2;
        if (i >= 0) {
            if (i2 >= i) {
                if (num == null || num.intValue() > i) {
                    return;
                }
                throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i + ')').toString());
            }
            vs.i(i2, "The maximum number of digits (", ") is less than the minimum number of digits (", i);
            throw null;
        }
        p1a.k(hl5.l("The minimum number of digits (", ") is negative", i));
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, yq4] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, yq4] */
    @Override // defpackage.bc4
    public final yq4 a() {
        o89 o89Var = this.a.a;
        ?? obj = new Object();
        int i = this.b;
        if (i >= 0) {
            if (i <= 9) {
                if (this.c != null) {
                    return new Object();
                }
                return obj;
            }
            p1a.k(hl5.l("The minimum number of digits (", ") exceeds the length of an Int", i));
            return null;
        }
        p1a.k(hl5.l("The minimum number of digits (", ") is negative", i));
        return null;
    }

    @Override // defpackage.bc4
    public final zm8 b() {
        Integer valueOf = Integer.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(this.d);
        hxc hxcVar = this.a;
        return qye.p(valueOf, valueOf2, this.c, hxcVar.a, hxcVar.b, false);
    }

    @Override // defpackage.bc4
    public final /* bridge */ /* synthetic */ g1 c() {
        return this.a;
    }
}
