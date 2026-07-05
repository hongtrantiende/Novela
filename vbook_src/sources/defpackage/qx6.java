package defpackage;

import com.google.android.gms.tasks.Task;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qx6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qx6 implements vt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ qx6(uz6 uz6Var) {
        this.a = 2;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        String a;
        switch (this.a) {
            case 0:
                return yae.z(Boolean.FALSE);
            case 1:
                return new qz6();
            case 2:
                Float valueOf = Float.valueOf(0.5f);
                nb6 nb6Var = new nb6(valueOf);
                pb6 pb6Var = (pb6) uc7.b().a(pb6.class);
                dne dneVar = pb6Var.b;
                dneVar.getClass();
                xze xzeVar = pb6Var.a;
                qb6 qb6Var = new qb6(nb6Var, dneVar, xzeVar, (Executor) pb6Var.c.a.get());
                odd oddVar = new odd(15, false);
                oddVar.d = qb6Var.C;
                jje jjeVar = new jje(3);
                jjeVar.c = qb6.V(valueOf);
                oddVar.e = new pve(jjeVar);
                kj kjVar = new kj(oddVar, 1);
                Task task = xzeVar.e;
                if (task.isSuccessful()) {
                    a = (String) task.getResult();
                } else {
                    a = gn6.c.a(xzeVar.g);
                }
                eqe.a.execute(new sid(xzeVar, kjVar, ate.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a, 6));
                ((dne) qb6Var.e.get()).b.incrementAndGet();
                return qb6Var;
            case 3:
                return new m78("com.reader.app.ui.MainRoute", a07.INSTANCE, new Annotation[0]);
            case 4:
                return 4;
            case 5:
                return yae.z(Boolean.FALSE);
            case 6:
                return yae.z(Boolean.FALSE);
            case 7:
                tza tzaVar = j27.a;
                return Boolean.FALSE;
            case 8:
                return new h27(rm1.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535), new etc(), new lfa(), sr7.a);
            case 9:
                return gs3.a;
            case 10:
                return new gm9(sl1.i0(sl1.u0(((Map) hr9.o.getValue()).keySet(), new pa5(13)), "|", null, null, new ww6(18), 30));
            case 11:
                return yae.z(Boolean.FALSE);
            case 12:
                return yae.z(0);
            case 13:
                return yae.z(Boolean.TRUE);
            case 14:
                return yae.z(Boolean.TRUE);
            case 15:
                return new d8(false, "", 0, 0, 0, "", "", "");
            case 16:
                return yae.z(Boolean.FALSE);
            case 17:
                return yae.z(Boolean.FALSE);
            case 18:
                return new e13();
            case 19:
                return new l13(false);
            case 20:
                return new m13("", false, false);
            case 21:
                return new g13(false, null);
            case 22:
                return new co3("", "", false);
            case 23:
                return new do3("", false, "", "");
            case 24:
                return new eo3("", "", false);
            case 25:
                return new fo3("", "", false);
            case 26:
                return new ho3("", "", "", "", false);
            case 27:
                return new io3(false, "", "", true, false, true);
            case 28:
                return yae.z(new jub((String) null, 0L, 7));
            default:
                return new rz4("", false);
        }
    }

    public /* synthetic */ qx6(int i) {
        this.a = i;
    }
}
