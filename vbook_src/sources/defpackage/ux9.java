package defpackage;

import android.content.ClipDescription;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ux9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ux9 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ux9(ux9 ux9Var, wob wobVar) {
        this.a = 25;
        this.b = ux9Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i = this.a;
        float f7 = nae.e;
        boolean z = true;
        boolean z2 = false;
        em1 em1Var = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((sx9) obj2).f(obj);
                return pvc.a;
            case 1:
                ((qra) obj2).remove(obj);
                return pvc.a;
            case 2:
                ((ib3) obj).getClass();
                return new r6((tl) obj2, 17);
            case 3:
                k2a k2aVar = (k2a) obj2;
                float floatValue = ((Float) obj).floatValue();
                em8 em8Var = k2aVar.a;
                float h = em8Var.h() + floatValue + k2aVar.g;
                float m = dce.m(h, nae.e, k2aVar.f.h());
                if (h != m) {
                    z = false;
                }
                float h2 = m - em8Var.h();
                int round = Math.round(h2);
                em8Var.i(em8Var.h() + round);
                k2aVar.g = h2 - round;
                if (!z) {
                    floatValue = h2;
                }
                return Float.valueOf(floatValue);
            case 4:
                t3a t3aVar = (t3a) obj2;
                return new y78(t3aVar.d(t3aVar.k, ((y78) obj).a, t3aVar.j));
            case 5:
                z09 z09Var = (z09) obj;
                if (((wr7) obj2).c(z09Var.c)) {
                    z09Var.a();
                }
                return pvc.a;
            case 6:
                obj.getClass();
                return ((i) obj2).invoke();
            case 7:
                s76 s76Var = (s76) obj2;
                ((List) obj).getClass();
                return s76Var;
            case 8:
                iaa iaaVar = (iaa) obj2;
                do6 do6Var = (do6) obj;
                do6Var.getClass();
                iaaVar.getClass();
                iaaVar.P = by5.a.k().b();
                return new rf0(do6Var, iaaVar, 16);
            case 9:
                yda ydaVar = (yda) obj2;
                ((Boolean) obj).getClass();
                hk1 a = jdd.a(ydaVar);
                sw2 sw2Var = ab3.a;
                ydaVar.f(a, ru2.c, new wda(ydaVar, null, 3));
                return pvc.a;
            case 10:
                ((Float) obj).getClass();
                r13 r13Var = ((yha) obj2).c;
                if (r13Var != null) {
                    return Float.valueOf(r13Var.L0(56.0f));
                }
                vs.m("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
                return null;
            case 11:
                lia liaVar = (lia) obj2;
                String str = (String) obj;
                str.getClass();
                hk1 a2 = jdd.a(liaVar);
                sw2 sw2Var2 = ab3.a;
                liaVar.f(a2, ru2.c, new jk8(liaVar, str, (m42) null, 22));
                return pvc.a;
            case 12:
                return ((vla) obj2).b(((Integer) obj).intValue());
            case 13:
                bma bmaVar = (bma) obj2;
                lq lqVar = (lq) obj;
                lqVar.getClass();
                bmaVar.n(Float.intBitsToFloat((int) (((y78) lqVar.e()).a >> 32)));
                bmaVar.o(Float.intBitsToFloat((int) (((y78) lqVar.e()).a & 4294967295L)));
                return pvc.a;
            case 14:
                vma vmaVar = (vma) obj2;
                u8a u8aVar = vmaVar.f;
                u8aVar.getClass();
                if (!c16.i(vmaVar.f, u8aVar)) {
                    e39.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                uv7 uv7Var = vmaVar.e;
                Object obj3 = vmaVar.c;
                if (uv7Var == null) {
                    if (obj3 == null) {
                        vmaVar.c = obj;
                    } else {
                        uv7 uv7Var2 = uz9.a;
                        uv7 uv7Var3 = new uv7();
                        uv7Var3.a(obj3);
                        uv7Var3.a(obj);
                        vmaVar.e = uv7Var3;
                        vmaVar.c = null;
                    }
                } else {
                    if (obj3 != null) {
                        e39.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    uv7Var.a(obj);
                }
                return pvc.a;
            case 15:
                ((ib3) obj).getClass();
                return new r6((hoa) obj2, 19);
            case 16:
                return Integer.valueOf(((bqa) obj2).a(zbe.m(((ls7) obj).e)));
            case 17:
                sra sraVar = (sra) obj2;
                synchronized (sraVar.g) {
                    rra rraVar = sraVar.i;
                    rraVar.getClass();
                    Object obj4 = rraVar.b;
                    obj4.getClass();
                    int i2 = rraVar.d;
                    gv7 gv7Var = rraVar.c;
                    if (gv7Var == null) {
                        gv7Var = new gv7();
                        rraVar.c = gv7Var;
                        rraVar.f.n(obj4, gv7Var);
                    }
                    rraVar.b(obj, i2, obj4, gv7Var);
                }
                return pvc.a;
            case 18:
                oua ouaVar = (oua) obj2;
                do6 do6Var2 = (do6) obj;
                do6Var2.getClass();
                ouaVar.k();
                return new rf0(do6Var2, ouaVar, 17);
            case 19:
                vi1 vi1Var = (vi1) obj2;
                long j = ((y78) obj).a;
                fvb fvbVar = vi1Var.c;
                if (fvbVar != null) {
                    int g = fvbVar.b.g(j);
                    List d = fvbVar.a.a.d(g, g);
                    int size = d.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        os osVar = (os) d.get(i3);
                        if (c16.i(osVar.d, vi1Var.b)) {
                            vi1Var.a.invoke(osVar.a);
                        }
                    }
                }
                return pvc.a;
            case 20:
                nh9 nh9Var = (nh9) obj;
                nh9Var.getClass();
                zx5 zx5Var = zx5.c;
                return c16.x(bze.k(nh9Var.c), (w9c) obj2).a();
            case 21:
                t15 t15Var = (t15) obj;
                x5b M1 = w5b.M1((w5b) obj2, 4);
                float f8 = 1.0f;
                if (M1.v((byte) 21)) {
                    f = M1.H;
                } else {
                    f = 1.0f;
                }
                t15Var.q(f);
                if (M1.v((byte) 22)) {
                    f2 = M1.I;
                } else {
                    f2 = 1.0f;
                }
                t15Var.v(f2);
                if (M1.v((byte) 23)) {
                    f8 = M1.J;
                }
                t15Var.l(f8);
                if (M1.v((byte) 24)) {
                    f3 = M1.K;
                } else {
                    f3 = 0.0f;
                }
                t15Var.x(f3);
                if (M1.v((byte) 25)) {
                    f4 = M1.L;
                } else {
                    f4 = 0.0f;
                }
                t15Var.i(f4);
                if (M1.v((byte) 26)) {
                    f5 = M1.M;
                } else {
                    f5 = 0.0f;
                }
                t15Var.C(f5);
                if (M1.v((byte) 27)) {
                    f6 = M1.N;
                } else {
                    f6 = 0.0f;
                }
                t15Var.c(f6);
                if (M1.v((byte) 28)) {
                    f7 = M1.O;
                }
                t15Var.h(f7);
                if (M1.w(54)) {
                    em1Var = M1.T;
                    em1Var.getClass();
                }
                t15Var.s(em1Var);
                long j2 = ckc.b;
                if (M1.v((byte) 29) || M1.v((byte) 30)) {
                    float b = ckc.b(j2);
                    if (M1.v((byte) 29)) {
                        b = M1.P;
                    }
                    float c = ckc.c(j2);
                    if (M1.v((byte) 30)) {
                        c = M1.Q;
                    }
                    j2 = y9e.j(b, c);
                }
                t15Var.Z0(j2);
                if (M1.v((byte) 31)) {
                    z2 = M1.D;
                }
                t15Var.w(z2);
                wea weaVar = lre.g;
                if (M1.w(53)) {
                    weaVar = M1.E;
                }
                t15Var.J0(weaVar);
                return pvc.a;
            case 22:
                llb llbVar = (llb) obj2;
                zu9 zu9Var = (zu9) obj;
                zu9Var.getClass();
                k74 k74Var = llbVar.a;
                j74 j74Var = new j74(k74Var, null, 0);
                ArrayList arrayList = zu9Var.a;
                qg5 qg5Var = qg5.a;
                arrayList.add(new yu9(qg5Var, "/extension/docs", j74Var));
                zu9Var.a("/extension/install", new j74(k74Var, null, 1));
                zu9Var.a("/extension/test", new j74(k74Var, null, 2));
                zu9Var.a("/extension/build", new j74(k74Var, null, 3));
                arrayList.add(new yu9(qg5Var, "/connect", new bo0(2, 2, null)));
                zu9Var.a("/mcp", new z45(zu9Var, llbVar.b, (m42) null, 8));
                return pvc.a;
            case 23:
                Drawable drawable = (Drawable) obj2;
                ak3 ak3Var = (ak3) obj;
                k61 w = ak3Var.Q0().w();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (ak3Var.b() >> 32)), (int) Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)));
                drawable.draw(tf.a(w));
                return pvc.a;
            case 24:
                ((xt4) obj).invoke((lob) obj2);
                return pvc.a;
            case 25:
                ux9 ux9Var = (ux9) obj2;
                rnc rncVar = (rnc) obj;
                if (rncVar instanceof e8) {
                    ux9Var.invoke(((e8) rncVar).K);
                    return Boolean.TRUE;
                }
                vs.k("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 26:
                af9 af9Var = (af9) obj;
                af9Var.getClass();
                ((kf9) obj2).l(af9Var.c);
                return pvc.a;
            case 27:
                lrb lrbVar = (lrb) obj2;
                sc6 sc6Var = (sc6) obj;
                rk9 rk9Var = (rk9) lrbVar.Q.y.getValue();
                if (rk9Var == null) {
                    rk9Var = rk9.e;
                }
                sc6 e = lrbVar.O.e();
                if (e != null) {
                    return jye.x(rk9Var, e, sc6Var);
                }
                ov5.d("Required value was null.");
                ls2.c();
                return null;
            case 28:
                ClipDescription clipDescription = ((bh3) obj).a.getClipDescription();
                Iterable<v67> iterable = (Iterable) ((prb) obj2).invoke();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (v67 v67Var : iterable) {
                        if (!c16.i(v67Var, v67.c) && (clipDescription == null || !clipDescription.hasMimeType(v67Var.a))) {
                        }
                        return Boolean.valueOf(z);
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                zsb zsbVar = (zsb) obj2;
                float floatValue2 = ((Float) obj).floatValue();
                dm8 dm8Var = zsbVar.a;
                float h3 = dm8Var.h() + floatValue2;
                dm8 dm8Var2 = zsbVar.b;
                if (h3 > dm8Var2.h()) {
                    floatValue2 = dm8Var2.h() - dm8Var.h();
                } else if (h3 < nae.e) {
                    floatValue2 = -dm8Var.h();
                }
                dm8Var.i(dm8Var.h() + floatValue2);
                return Float.valueOf(floatValue2);
        }
    }

    public /* synthetic */ ux9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
