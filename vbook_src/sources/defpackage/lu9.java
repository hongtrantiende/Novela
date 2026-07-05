package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lu9  reason: default package */
/* loaded from: classes.dex */
public final class lu9 extends ld6 {
    public static final lu9 c = new lu9("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu9(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                ls3 ls3Var = ls3.a;
                if (size != 0) {
                    if (size != 1) {
                        ArrayList arrayList = new ArrayList(list.size());
                        int size2 = list.size();
                        int i = 0;
                        int i2 = 0;
                        for (int i3 = 0; i3 < size2; i3++) {
                            mw8 M = ((w27) list.get(i3)).M(j);
                            i = Math.max(M.a, i);
                            i2 = Math.max(M.b, i2);
                            arrayList.add(M);
                        }
                        return e37Var.q0(y02.g(i, j), y02.f(i2, j), ls3Var, new bi(3, arrayList));
                    }
                    mw8 M2 = ((w27) list.get(0)).M(j);
                    return e37Var.q0(y02.g(M2.a, j), y02.f(M2.b, j), ls3Var, new dg(M2, 6));
                }
                return e37Var.q0(x02.k(j), x02.j(j), ls3Var, co9.d);
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
