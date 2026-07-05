package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hgd  reason: default package */
/* loaded from: classes3.dex */
public final class hgd extends aab implements mu4 {
    public int a;
    public /* synthetic */ qv8 b;
    public /* synthetic */ qh5 c;
    public final /* synthetic */ igd d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgd(m42 m42Var, igd igdVar, boolean z) {
        super(3, m42Var);
        this.d = igdVar;
        this.e = z;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        hgd hgdVar = new hgd((m42) obj3, this.d, this.e);
        hgdVar.b = (qv8) obj;
        hgdVar.c = (qh5) obj2;
        return hgdVar.invokeSuspend(pvc.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        j03 j03Var;
        yy2 yy2Var;
        List list;
        qv8 qv8Var = this.b;
        qh5 qh5Var = this.c;
        int i = this.a;
        pvc pvcVar = pvc.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
                return pvcVar;
            }
            vs.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hre.r(obj);
        isc iscVar = qh5Var.a;
        Object obj2 = qh5Var.b;
        Object obj3 = qv8Var.a;
        oh5 d = ((te5) obj3).d();
        ii5 e = d.e();
        rf8 o = d.y0().c().o();
        if (!(o instanceof bgd)) {
            pw6 pw6Var = jgd.c;
            if (gwe.k(pw6Var)) {
                pw6Var.i("Skipping non-websocket response from " + ((te5) obj3).c().getUrl() + ": " + o);
                return pvcVar;
            }
        } else {
            ii5 ii5Var = ii5.c;
            if (c16.i(e, ii5Var)) {
                if (obj2 instanceof egd) {
                    pw6 pw6Var2 = jgd.c;
                    if (gwe.k(pw6Var2)) {
                        pw6Var2.i("Receive websocket session from " + ((te5) obj3).c().getUrl() + ": " + obj2);
                    }
                    igd igdVar = this.d;
                    long j = igdVar.a;
                    if (j != 2147483647L) {
                        ((egd) obj2).V0(j);
                    }
                    if (iscVar.a.equals(cm9.a(bt2.class))) {
                        egd egdVar = (egd) obj2;
                        boolean z = egdVar instanceof yy2;
                        if (z) {
                            yy2Var = (yy2) egdVar;
                        } else {
                            agd agdVar = igdVar.c;
                            pw6 pw6Var3 = ez2.a;
                            agdVar.getClass();
                            if (!z) {
                                dz2 dz2Var = new dz2(egdVar, agdVar.a, agdVar.b);
                                dz2Var.V0(igdVar.a);
                                yy2Var = dz2Var;
                            } else {
                                vs.m("Cannot wrap other DefaultWebSocketSession");
                                return null;
                            }
                        }
                        te5 te5Var = (te5) obj3;
                        bt2 bt2Var = new bt2(te5Var, yy2Var);
                        if (this.e) {
                            String b = te5Var.d().a().b("Sec-WebSocket-Extensions");
                            if (b != null) {
                                List<String> z0 = k4b.z0(b, new String[]{","});
                                ArrayList arrayList = new ArrayList(tl1.s(z0, 10));
                                for (String str : z0) {
                                    List z02 = k4b.z0(str, new String[]{";"});
                                    String obj4 = k4b.N0((String) sl1.c0(z02)).toString();
                                    List<String> Y = sl1.Y(z02, 1);
                                    ArrayList arrayList2 = new ArrayList(tl1.s(Y, 10));
                                    for (String str2 : Y) {
                                        arrayList2.add(k4b.N0(str2).toString());
                                    }
                                    arrayList.add(new rwa(obj4, arrayList2));
                                }
                            }
                            list = new ArrayList();
                            Iterator it = ((List) te5Var.getAttributes().c(jgd.a)).iterator();
                            if (it.hasNext()) {
                                throw rs8.f(it);
                            }
                        } else {
                            list = ks3.a;
                        }
                        bt2Var.a.I0(list);
                        j03Var = bt2Var;
                    } else {
                        j03Var = new j03((te5) obj3, (egd) obj2);
                    }
                    qh5 qh5Var2 = new qh5(iscVar, j03Var);
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    Object d2 = qv8Var.d(this, qh5Var2);
                    n82 n82Var = n82.a;
                    if (d2 == n82Var) {
                        return n82Var;
                    }
                } else {
                    gi1 a = cm9.a(obj2.getClass());
                    throw new bj1(9, "Handshake exception, expected `WebSocketSession` content but was " + a, null);
                }
            } else {
                int i2 = ii5Var.a;
                int i3 = e.a;
                throw new bj1(9, "Handshake exception, expected status code " + i2 + " but was " + i3, null);
            }
        }
        return pvcVar;
    }
}
