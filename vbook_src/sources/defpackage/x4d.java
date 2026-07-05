package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x4d  reason: default package */
/* loaded from: classes.dex */
public final class x4d extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y4d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4d(y4d y4dVar, int i) {
        super(1);
        this.a = i;
        this.b = y4dVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        long j;
        int i = this.a;
        y4d y4dVar = this.b;
        switch (i) {
            case 0:
                qkc qkcVar = (qkc) obj;
                st3 st3Var = st3.a;
                st3 st3Var2 = st3.b;
                if (qkcVar.c(st3Var, st3Var2)) {
                    v4d v4dVar = y4dVar.L.a.e;
                    if (v4dVar != null) {
                        return v4dVar.c;
                    }
                    return zt3.c;
                } else if (qkcVar.c(st3Var2, st3.c)) {
                    v4d v4dVar2 = y4dVar.M.a.e;
                    if (v4dVar2 != null) {
                        return v4dVar2.c;
                    }
                    return zt3.c;
                } else {
                    return zt3.c;
                }
            default:
                int ordinal = ((st3) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            v4d v4dVar3 = y4dVar.M.a.e;
                            if (v4dVar3 != null) {
                                j = v4dVar3.b;
                            } else {
                                j = y4dVar.N.e;
                            }
                        } else {
                            xk5.o();
                            return null;
                        }
                    } else {
                        v4d v4dVar4 = y4dVar.L.a.e;
                        if (v4dVar4 != null) {
                            j = v4dVar4.b;
                        } else {
                            v4d v4dVar5 = y4dVar.M.a.e;
                            if (v4dVar5 != null) {
                                j = v4dVar5.a;
                            } else {
                                j = zl1.h;
                            }
                        }
                    }
                } else {
                    v4d v4dVar6 = y4dVar.L.a.e;
                    if (v4dVar6 != null) {
                        j = v4dVar6.a;
                    } else {
                        j = zl1.h;
                    }
                }
                return new zl1(j);
        }
    }
}
