package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v65  reason: default package */
/* loaded from: classes3.dex */
public final class v65 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ boolean b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v65(Context context, m42 m42Var) {
        super(2, m42Var);
        this.a = 8;
        this.c = context;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new v65((w65) this.c, this.b, m42Var, 0);
            case 1:
                v65 v65Var = new v65(this.b, m42Var);
                v65Var.c = obj;
                return v65Var;
            case 2:
                return new v65(this.b, (d1d) this.c, m42Var, 2);
            case 3:
                return new v65((fw7) this.c, this.b, m42Var, 3);
            case 4:
                return new v65((a0c) this.c, this.b, m42Var, 4);
            case 5:
                return new v65((t2c) this.c, this.b, m42Var, 5);
            case 6:
                return new v65((y5c) this.c, this.b, m42Var, 6);
            case 7:
                return new v65((ylc) this.c, this.b, m42Var, 7);
            case 8:
                v65 v65Var2 = new v65((Context) this.c, m42Var);
                v65Var2.b = ((Boolean) obj).booleanValue();
                return v65Var2;
            case 9:
                return new v65(this.b, (t7d) this.c, m42Var, 9);
            default:
                return new v65(this.b, (qi8) this.c, m42Var, 10);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((v65) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((v65) create((gh5) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((v65) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((v65) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                ((v65) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 5:
                ((v65) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 6:
                ((v65) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 7:
                ((v65) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((v65) create(bool, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 9:
                ((v65) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((v65) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                hre.r(obj);
                w65 w65Var = (w65) this.c;
                ((qi9) w65Var.f).a.e.e(xh9.s[3], Boolean.valueOf(this.b));
                cza czaVar = w65Var.C;
                boolean z = this.b;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, t65.a((t65) value, 0, 0, false, false, false, z, null, 191)));
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                hre.r(obj);
                ((gh5) this.c).f.a(pe5.c, new g64(1, this.b));
                return pvcVar;
            case 2:
                hre.r(obj);
                if (this.b) {
                    ((d1d) this.c).j();
                }
                return pvcVar;
            case 3:
                hre.r(obj);
                ((fw7) this.c).c.setValue(Boolean.valueOf(this.b));
                return pvcVar;
            case 4:
                hre.r(obj);
                a0c a0cVar = (a0c) this.c;
                a2c a2cVar = a0cVar.c;
                boolean z2 = this.b;
                i2c i2cVar = (i2c) a2cVar;
                y1c y1cVar = i2cVar.a;
                String c = y1cVar.c();
                String j = i2cVar.j();
                c.getClass();
                h49 b = y1cVar.b();
                b.getClass();
                sn0 d = b.d();
                d.getClass();
                z87.B(new nn0(d, "tts_punctuation_" + c + "_" + j, z2, null, 1));
                cza czaVar2 = a0cVar.d;
                boolean z3 = this.b;
                if (czaVar2 != null) {
                    while (true) {
                        Object value4 = czaVar2.getValue();
                        boolean z4 = z3;
                        if (!czaVar2.l(value4, nzb.a((nzb) value4, nae.e, nae.e, null, null, null, null, null, null, null, 0, null, false, null, null, 0, false, false, z4, 131071))) {
                            z3 = z4;
                        }
                    }
                }
                return pvcVar;
            case 5:
                hre.r(obj);
                t2c t2cVar = (t2c) this.c;
                ((i2c) t2cVar.C).a.e.e(y1c.o[4], Boolean.valueOf(this.b));
                cza czaVar3 = t2cVar.H;
                boolean z5 = this.b;
                if (czaVar3 != null) {
                    do {
                        value2 = czaVar3.getValue();
                    } while (!czaVar3.l(value2, ozb.a((ozb) value2, nae.e, nae.e, 0L, false, z5, nae.e, null, 0, 479)));
                    t2cVar.d.getClass();
                    mfb mfbVar = ix3.a;
                    ix3.a(yyb.a);
                    return pvcVar;
                }
                t2cVar.d.getClass();
                mfb mfbVar2 = ix3.a;
                ix3.a(yyb.a);
                return pvcVar;
            case 6:
                hre.r(obj);
                y5c y5cVar = (y5c) this.c;
                ((mnb) y5cVar.V).a.b.e(qwb.A[3], Boolean.valueOf(this.b));
                cza czaVar4 = y5cVar.t0;
                boolean z6 = this.b;
                if (czaVar4 != null) {
                    while (true) {
                        Object value5 = czaVar4.getValue();
                        boolean z7 = z6;
                        if (!czaVar4.l(value5, nnb.a((nnb) value5, null, null, null, null, null, null, false, null, nae.e, nae.e, nae.e, nae.e, nae.e, 0, 0, false, nae.e, false, z7, 0, 0, 0, 0, false, false, false, false, false, 0, false, nae.e, 0, 0, 0, 0, -262145, 7))) {
                            z6 = z7;
                        }
                    }
                }
                return pvcVar;
            case 7:
                hre.r(obj);
                ylc ylcVar = (ylc) this.c;
                ylcVar.K = this.b;
                cza czaVar5 = ylcVar.D;
                if (czaVar5 != null) {
                    do {
                        value3 = czaVar5.getValue();
                    } while (!czaVar5.l(value3, qlc.b((qlc) value3, null, null, null, ylcVar.K, 0, null, null, null, 2031)));
                    return pvcVar;
                }
                return pvcVar;
            case 8:
                hre.r(obj);
                jh8.a((Context) this.c, RescheduleReceiver.class, this.b);
                return pvcVar;
            case 9:
                hre.r(obj);
                boolean z8 = this.b;
                t7d t7dVar = (t7d) this.c;
                if (z8) {
                    t7dVar.j++;
                    iya iyaVar = t7dVar.h;
                    if (iyaVar != null) {
                        iyaVar.cancel(null);
                    }
                } else {
                    t7dVar.c();
                }
                return pvcVar;
            default:
                hre.r(obj);
                if (!this.b) {
                    ((qi8) this.c).e = false;
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v65(Object obj, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v65(boolean z, m42 m42Var) {
        super(2, m42Var);
        this.a = 1;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v65(boolean z, Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
