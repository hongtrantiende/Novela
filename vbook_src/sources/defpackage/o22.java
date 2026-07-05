package defpackage;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o22  reason: default package */
/* loaded from: classes3.dex */
public final class o22 extends aab implements ou4 {
    public final /* synthetic */ hj1 C;
    public int a;
    public /* synthetic */ oh5 b;
    public /* synthetic */ s11 c;
    public /* synthetic */ isc d;
    public final /* synthetic */ Set e;
    public final /* synthetic */ List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o22(hj1 hj1Var, m42 m42Var, List list, Set set) {
        super(5, m42Var);
        this.e = set;
        this.f = list;
        this.C = hj1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Charset charset;
        Charset charset2;
        oh5 oh5Var = this.b;
        s11 s11Var = this.c;
        isc iscVar = this.d;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return obj;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        e32 z = oue.z(oh5Var);
        if (z == null) {
            return null;
        }
        n45 a = oh5Var.y0().c().a();
        Charset charset3 = ed1.a;
        a.getClass();
        charset3.getClass();
        Iterator it = sl1.u0(mue.n(a.b("Accept-Charset")), new pa5(4)).iterator();
        while (true) {
            if (it.hasNext()) {
                String str = ((j45) it.next()).a;
                if (c16.i(str, "*")) {
                    charset = charset3;
                    break;
                }
                Charset charset4 = ed1.a;
                str.getClass();
                if (Charset.isSupported(str)) {
                    charset = Charset.forName(str);
                    charset.getClass();
                    break;
                }
            } else {
                charset = null;
                break;
            }
        }
        if (charset == null) {
            charset2 = charset3;
        } else {
            charset2 = charset;
        }
        vyc url = oh5Var.y0().c().getUrl();
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = 1;
        Object b = r22.b(this.e, this.f, url, iscVar, s11Var, z, charset2, this);
        n82 n82Var = n82.a;
        if (b == n82Var) {
            return n82Var;
        }
        return b;
    }

    @Override // defpackage.ou4
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        gkc gkcVar = (gkc) obj;
        List list = this.f;
        o22 o22Var = new o22(this.C, (m42) obj5, list, this.e);
        o22Var.b = (oh5) obj2;
        o22Var.c = (s11) obj3;
        o22Var.d = (isc) obj4;
        return o22Var.invokeSuspend(pvc.a);
    }
}
