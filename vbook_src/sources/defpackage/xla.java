package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xla  reason: default package */
/* loaded from: classes3.dex */
public final class xla extends pf9 {
    public final int b;
    public final String[] c;
    public final mm d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xla(int i, String[] strArr, mm mmVar, String str, String str2, String str3, xt4 xt4Var) {
        super(xt4Var);
        mmVar.getClass();
        this.b = i;
        this.c = strArr;
        this.d = mmVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    @Override // defpackage.pf9
    public final void a(pl4 pl4Var) {
        String[] strArr = this.c;
        this.d.o((String[]) Arrays.copyOf(strArr, strArr.length), pl4Var);
    }

    @Override // defpackage.pf9
    public final tf9 b(xt4 xt4Var) {
        return this.d.G(Integer.valueOf(this.b), this.g, xt4Var, 0, null);
    }

    @Override // defpackage.pf9
    public final void f(pl4 pl4Var) {
        pl4Var.getClass();
        String[] strArr = this.c;
        this.d.V((String[]) Arrays.copyOf(strArr, strArr.length), pl4Var);
    }

    public final String toString() {
        return this.e + ':' + this.f;
    }
}
