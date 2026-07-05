package defpackage;

import android.os.Bundle;
import java.io.InputStream;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: me  reason: default package */
/* loaded from: classes3.dex */
public final class me extends aab implements mu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(cz7 cz7Var, int i, m42 m42Var) {
        super(3, m42Var);
        this.a = 9;
        this.d = cz7Var;
        this.b = i;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ke keVar = (ke) obj;
                t07 t07Var = (t07) obj2;
                return new me((oe) this.c, (l) this.d, (m42) obj3).invokeSuspend(pvcVar);
            case 1:
                m82 m82Var = (m82) obj;
                me meVar = new me((lhd) this.d, (m42) obj3, 1);
                meVar.c = (String) obj2;
                return meVar.invokeSuspend(pvcVar);
            case 2:
                me meVar2 = new me(3, 2, (m42) obj3);
                meVar2.c = (qv8) obj;
                meVar2.d = obj2;
                return meVar2.invokeSuspend(pvcVar);
            case 3:
                me meVar3 = new me(3, 3, (m42) obj3);
                meVar3.c = (qv8) obj;
                meVar3.d = (qh5) obj2;
                return meVar3.invokeSuspend(pvcVar);
            case 4:
                kba kbaVar = (kba) obj;
                me meVar4 = new me((Bundle) this.d, (m42) obj3, 4);
                meVar4.c = (ey) obj2;
                return meVar4.invokeSuspend(pvcVar);
            case 5:
                kba kbaVar2 = (kba) obj;
                me meVar5 = new me((String) this.d, (m42) obj3, 5);
                meVar5.c = (ey) obj2;
                return meVar5.invokeSuspend(pvcVar);
            case 6:
                qh5 qh5Var = (qh5) obj2;
                me meVar6 = new me((re5) this.d, (m42) obj3, 6);
                meVar6.c = (qv8) obj;
                return meVar6.invokeSuspend(pvcVar);
            case 7:
                me meVar7 = new me((nu4) this.d, (m42) obj3, 7);
                meVar7.c = (qv8) obj;
                return meVar7.invokeSuspend(pvcVar);
            case 8:
                me meVar8 = new me((lu4) this.d, (m42) obj3, 8);
                meVar8.c = (qv8) obj;
                return meVar8.invokeSuspend(pvcVar);
            case 9:
                m82 m82Var2 = (m82) obj;
                me meVar9 = new me((cz7) this.d, this.b, (m42) obj3);
                meVar9.c = (qfa) obj2;
                meVar9.invokeSuspend(pvcVar);
                return pvcVar;
            default:
                me meVar10 = new me((ou4) this.d, (m42) obj3, 10);
                meVar10.c = (qv8) obj;
                return meVar10.invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        rf8 rf8Var;
        e32 e32Var;
        me meVar;
        int i = this.a;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    ne neVar = ((oe) this.c).a;
                    this.b = 1;
                    if (((l) this.d).invoke(neVar, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 1:
                String str = (String) this.c;
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    str.getClass();
                    String str2 = "\n        (function() {\n            if (!window.__vb) return;\n            var list = " + str + ";\n            for (var i = 0; i < list.length; i++) {\n                var t = list[i].text;\n                if (t == null || t === '') continue;\n                var e = window.__vb.entries[list[i].id];\n                if (!e) continue;\n                if (e.attr == null) {\n                    e.node.nodeValue = t;\n                } else if (e.attr === 'value') {\n                    e.node.value = t;\n                } else {\n                    e.node.setAttribute(e.attr, t);\n                }\n            }\n        })();\n    ";
                    this.c = null;
                    this.b = 1;
                    if (((lhd) this.d).e(str2, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 2:
                qv8 qv8Var = (qv8) this.c;
                Object obj2 = this.d;
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
                    Object obj3 = qv8Var.a;
                    if (((gh5) obj3).c.v("Accept") == null) {
                        ((gh5) obj3).c.h("Accept", "*/*");
                    }
                    gh5 gh5Var = (gh5) obj3;
                    e32 A = oue.A(gh5Var);
                    if (obj2 instanceof String) {
                        String str3 = (String) obj2;
                        if (A == null) {
                            A = d32.a;
                        }
                        rf8Var = new onb(str3, A);
                    } else if (obj2 instanceof byte[]) {
                        rf8Var = new my2(A, obj2);
                    } else if (obj2 instanceof s11) {
                        rf8Var = new ny2(qv8Var, A, obj2);
                    } else if (obj2 instanceof rf8) {
                        rf8Var = (rf8) obj2;
                    } else {
                        gh5Var.getClass();
                        obj2.getClass();
                        if (obj2 instanceof InputStream) {
                            rf8Var = new ny2(gh5Var, A, obj2);
                        } else {
                            rf8Var = null;
                        }
                    }
                    if (rf8Var != null) {
                        e32Var = rf8Var.b();
                    } else {
                        e32Var = null;
                    }
                    if (e32Var != null) {
                        o45 o45Var = gh5Var.c;
                        o45Var.getClass();
                        ((Map) o45Var.a).remove("Content-Type");
                        py2.a.i("Transformed with default transformers request body for " + gh5Var.a + " from " + cm9.a(obj2.getClass()));
                        this.c = null;
                        this.d = null;
                        this.b = 1;
                        if (qv8Var.d(this, rf8Var) == n82Var) {
                            return n82Var;
                        }
                    }
                }
                return pvcVar;
            case 3:
                qv8 qv8Var2 = (qv8) this.c;
                qh5 qh5Var = (qh5) this.d;
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
                    isc iscVar = qh5Var.a;
                    Object obj4 = qh5Var.b;
                    if ((obj4 instanceof s11) && iscVar.a.equals(cm9.a(InputStream.class))) {
                        w26 w26Var = (w26) ((te5) qv8Var2.a).q().get(r0f.I);
                        qh5 qh5Var2 = new qh5(iscVar, new ln0(new ln0((s11) obj4, 0), 2));
                        this.c = null;
                        this.d = null;
                        this.b = 1;
                        if (qv8Var2.d(this, qh5Var2) == n82Var) {
                            return n82Var;
                        }
                    }
                }
                return pvcVar;
            case 4:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    ey eyVar = (ey) this.c;
                    this.b = 1;
                    eyVar.getClass();
                    Object e = eyVar.e(new wx((Bundle) this.d), this);
                    if (e != n82Var) {
                        e = pvcVar;
                    }
                    if (e == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 5:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    ey eyVar2 = (ey) this.c;
                    this.b = 1;
                    eyVar2.getClass();
                    Object e2 = eyVar2.e(new vx((String) this.d), this);
                    if (e2 != n82Var) {
                        e2 = pvcVar;
                    }
                    if (e2 == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 6:
                qv8 qv8Var3 = (qv8) this.c;
                int i8 = this.b;
                try {
                    if (i8 != 0) {
                        if (i8 == 1) {
                            hre.r(obj);
                        } else {
                            vs.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        hre.r(obj);
                        this.c = qv8Var3;
                        this.b = 1;
                        obj = qv8Var3.c(this);
                        if (obj == n82Var) {
                            return n82Var;
                        }
                    }
                    qh5 qh5Var3 = (qh5) obj;
                    return pvcVar;
                } catch (Throwable th) {
                    uwd uwdVar = ((re5) this.d).E;
                    ((te5) qv8Var3.a).d();
                    uwdVar.getClass();
                    a82.x(((a72) uwdVar.b).a(cj1.d));
                    throw th;
                }
            case 7:
                qv8 qv8Var4 = (qv8) this.c;
                int i9 = this.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    Object obj5 = new Object();
                    Object obj6 = qv8Var4.a;
                    Object b = qv8Var4.b();
                    this.c = null;
                    this.b = 1;
                    if (((nu4) this.d).h(obj5, obj6, b, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 8:
                qv8 qv8Var5 = (qv8) this.c;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    Object obj7 = qv8Var5.a;
                    this.c = null;
                    this.b = 1;
                    if (((lu4) this.d).invoke(obj7, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 9:
                cz7 cz7Var = (cz7) this.d;
                qfa qfaVar = (qfa) this.c;
                hre.r(obj);
                if (qfaVar != null) {
                    cz7Var.c();
                    if (this.b == -1) {
                        zr1.w(cz7Var, qfaVar.a);
                        return pvcVar;
                    }
                    return pvcVar;
                }
                xk5.o();
                return null;
            default:
                qv8 qv8Var6 = (qv8) this.c;
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            hre.r(obj);
                            return pvcVar;
                        }
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                    meVar = this;
                } else {
                    hre.r(obj);
                    this.c = qv8Var6;
                    this.b = 1;
                    meVar = this;
                    obj = ((ou4) this.d).l(new Object(), qv8Var6.a, qv8Var6.b(), (isc) ((gh5) qv8Var6.a).f.e(wp9.a), meVar);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                rf8 rf8Var2 = (rf8) obj;
                if (rf8Var2 != null) {
                    meVar.c = null;
                    meVar.b = 2;
                    if (qv8Var6.d(meVar, rf8Var2) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(oe oeVar, l lVar, m42 m42Var) {
        super(3, m42Var);
        this.a = 0;
        this.c = oeVar;
        this.d = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ me(int i, int i2, m42 m42Var) {
        super(i, m42Var);
        this.a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ me(Object obj, m42 m42Var, int i) {
        super(3, m42Var);
        this.a = i;
        this.d = obj;
    }
}
