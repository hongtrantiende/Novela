package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u52  reason: default package */
/* loaded from: classes3.dex */
public final class u52 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ btd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u52(btd btdVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = btdVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new u52(this.b, m42Var, 0);
            default:
                return new u52(this.b, m42Var, 1);
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
                ((u52) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((u52) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        btd btdVar = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                sz9.o.getClass();
                btdVar.m(new rh4(1.5f));
                return pvcVar;
            default:
                hre.r(obj);
                btdVar.m(new lh9(20));
                hm8 hm8Var = btdVar.H;
                Boolean bool = Boolean.TRUE;
                hm8Var.setValue(bool);
                yrd yrdVar = btdVar.c;
                yrdVar.getClass();
                zr1.A();
                boolean z = yrdVar.l;
                mw6 mw6Var = mw6.b;
                if (!z) {
                    yrdVar.l = true;
                    qw6 qw6Var = yrdVar.a;
                    qw6Var.getClass();
                    if (qw6Var.a(mw6Var)) {
                        pj pjVar = qw6Var.b;
                        String str = qw6Var.a;
                        pjVar.getClass();
                        pj.a(mw6Var, str, "ZoomableState. threeStepScale=true");
                    }
                }
                btdVar.K.setValue(bool);
                yrdVar.getClass();
                zr1.A();
                if (!yrdVar.p) {
                    yrdVar.p = true;
                    qw6 qw6Var2 = yrdVar.a;
                    qw6Var2.getClass();
                    if (qw6Var2.a(mw6Var)) {
                        pj pjVar2 = qw6Var2.b;
                        String str2 = qw6Var2.a;
                        pjVar2.getClass();
                        pj.a(mw6Var, str2, "ZoomableState. keepTransformWhenSameAspectRatioContentSizeChanged=true");
                    }
                }
                return pvcVar;
        }
    }
}
