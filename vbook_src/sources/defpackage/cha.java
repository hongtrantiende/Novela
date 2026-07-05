package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cha  reason: default package */
/* loaded from: classes.dex */
public final class cha extends aab implements lu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ eha c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cha(eha ehaVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = ehaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        eha ehaVar = this.c;
        switch (i) {
            case 0:
                cha chaVar = new cha(ehaVar, m42Var, 0);
                chaVar.b = obj;
                return chaVar;
            default:
                cha chaVar2 = new cha(ehaVar, m42Var, 1);
                chaVar2.b = obj;
                return chaVar2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        vaa vaaVar = (vaa) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((cha) create(vaaVar, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((cha) create(vaaVar, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        zaa zaaVar;
        yk8 yk8Var;
        int i = this.a;
        eha ehaVar = this.c;
        switch (i) {
            case 0:
                hre.r(obj);
                ehaVar.d.getClass();
                return vaa.a((vaa) this.b, null, t9c.a(), null, 5);
            default:
                hre.r(obj);
                vaa vaaVar = (vaa) this.b;
                n69 n69Var = ehaVar.f;
                boolean e = ehaVar.e(vaaVar);
                Map map = vaaVar.c;
                if (map != null) {
                    n69Var.getClass();
                    z = false;
                    if (!n69Var.f) {
                        ArrayList e2 = r4.e(n69Var.a);
                        ArrayList arrayList = new ArrayList();
                        int size = e2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj2 = e2.get(i2);
                            i2++;
                            o69 o69Var = (o69) obj2;
                            l69 l69Var = (l69) map.get(o69Var.a);
                            if (l69Var != null) {
                                yk8Var = new yk8(o69Var, l69Var);
                            } else {
                                yk8Var = null;
                            }
                            if (yk8Var != null) {
                                arrayList.add(yk8Var);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            int size2 = arrayList.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj3 = arrayList.get(i3);
                                i3++;
                                yk8 yk8Var2 = (yk8) obj3;
                                o69 o69Var2 = (o69) yk8Var2.a;
                                l69 l69Var2 = (l69) yk8Var2.b;
                                boolean i4 = c16.i(n69Var.a(), o69Var2.a);
                                int i5 = o69Var2.b;
                                if (i4) {
                                    if (i5 == l69Var2.a && c16.i((String) n69Var.d.getValue(), l69Var2.b)) {
                                    }
                                } else if (i5 != l69Var2.a) {
                                }
                            }
                        }
                        z = true;
                    }
                    if (z) {
                        Log.d("FirebaseSessions", "Cold app start detected");
                    }
                } else {
                    Log.d("FirebaseSessions", "No process data map");
                    z = true;
                }
                boolean d = ehaVar.d(vaaVar);
                if (z) {
                    map = n69Var.b(ls3.a);
                } else if (d) {
                    map = n69Var.b(map);
                }
                if (z) {
                    zaaVar = null;
                } else {
                    zaaVar = vaaVar.a;
                }
                if (!e && !z) {
                    if (d) {
                        return vaa.a(vaaVar, null, null, n69Var.b(map), 3);
                    }
                    return vaaVar;
                }
                zaa a = ehaVar.b.a(zaaVar);
                dba dbaVar = ehaVar.c;
                z87.v(k27.a(dbaVar.e), null, null, new ba(dbaVar, a, (m42) null, 7), 3);
                n69Var.f = true;
                return new vaa(a, null, map);
        }
    }
}
