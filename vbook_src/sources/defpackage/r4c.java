package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r4c  reason: default package */
/* loaded from: classes3.dex */
public final class r4c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ y5c c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r4c(y5c y5cVar, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = y5cVar;
        this.d = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new r4c(this.c, this.d, m42Var, 0);
            case 1:
                return new r4c(this.c, this.d, m42Var, 1);
            case 2:
                return new r4c(this.c, this.d, m42Var, 2);
            default:
                return new r4c(this.c, this.d, m42Var, 3);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((r4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((r4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((r4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((r4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Collection values;
        String str;
        String B;
        long b;
        Object value2;
        zwb zwbVar;
        ArrayList arrayList;
        int i = this.a;
        pvc pvcVar = pvc.a;
        String str2 = this.d;
        n82 n82Var = n82.a;
        y5c y5cVar = this.c;
        Object obj2 = null;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                mx mxVar = new mx(y5cVar.j0, 4);
                ol olVar = new ol((Object) y5cVar, str2, (m42) null, 26);
                this.b = 1;
                Object D = z1d.D(mxVar, olVar, this);
                if (D == n82Var) {
                    return n82Var;
                }
                return D;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                cs0 cs0Var = y5cVar.Y;
                this.b = 1;
                ((is0) cs0Var).a.d.a0(str2);
                if (pvcVar == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    co4 co4Var = (co4) y5cVar.Q0.remove(str2);
                    if (co4Var != null) {
                        xo4 xo4Var = y5cVar.X;
                        String str3 = co4Var.a;
                        this.b = 1;
                        ((bp4) xo4Var).a(str3);
                        if (pvcVar == n82Var) {
                            return n82Var;
                        }
                    }
                }
                cza czaVar = y5cVar.z0;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                        values = y5cVar.Q0.values();
                        values.getClass();
                    } while (!czaVar.l(value, kub.a((kub) value, null, sl1.C0(values), 1)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    sc9 sc9Var = y5cVar.c0;
                    this.b = 1;
                    lm2 lm2Var = ((be9) sc9Var).a.P;
                    Iterator it = lm2Var.h0().c().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        str = this.d;
                        if (hasNext) {
                            Object next = it.next();
                            if (c16.i(((ap2) next).b, str)) {
                                obj2 = next;
                            }
                        }
                    }
                    ap2 ap2Var = (ap2) obj2;
                    if (ap2Var == null || (B = ap2Var.a) == null) {
                        B = ube.B();
                    }
                    String str4 = B;
                    if (ap2Var != null) {
                        b = ap2Var.c;
                    } else {
                        b = by5.a.k().b();
                    }
                    lm2Var.t0(new ap2(b, by5.a.k().b(), str4, str));
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                cza czaVar2 = y5cVar.I0;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                        zwbVar = (zwb) value2;
                        List list = zwbVar.g;
                        arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (!c16.i(((pc9) obj3).a, str2)) {
                                arrayList.add(obj3);
                            }
                        }
                    } while (!czaVar2.l(value2, zwb.a(zwbVar, false, false, false, null, null, 0, arrayList, 63)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
