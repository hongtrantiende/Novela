package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vs5  reason: default package */
/* loaded from: classes.dex */
public final class vs5 extends ss5 {
    public final az7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs5() {
        super(4);
        az7 az7Var = az7.b;
        this.d = az7Var;
    }

    @Override // defpackage.ss5, defpackage.hs5
    public final hs5 a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // defpackage.ss5
    public final ss5 f(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // defpackage.ss5
    public final /* bridge */ /* synthetic */ ts5 g() {
        throw null;
    }

    public final um9 h() {
        um9 um9Var;
        Object[] objArr = this.a;
        int i = this.b;
        az7 az7Var = this.d;
        if (i == 0) {
            if (az7.b != az7Var) {
                um9Var = new um9(mm9.e, az7Var);
            } else {
                um9Var = um9.D;
            }
        } else {
            yte.o(i, objArr);
            Arrays.sort(objArr, 0, i, az7Var);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (az7Var.compare(obj, objArr[i2 - 1]) != 0) {
                    objArr[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, i, (Object) null);
            if (i2 < objArr.length / 2) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            um9Var = new um9(qs5.h(i2, objArr), az7Var);
        }
        this.b = um9Var.C.size();
        this.c = true;
        return um9Var;
    }
}
