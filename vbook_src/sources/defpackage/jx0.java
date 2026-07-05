package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jx0  reason: default package */
/* loaded from: classes3.dex */
public final class jx0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jx0(int i, int i2, m42 m42Var) {
        super(i, m42Var);
        this.a = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                jx0 jx0Var = new jx0(2, 0, m42Var);
                jx0Var.b = ((Boolean) obj).booleanValue();
                return jx0Var;
            case 1:
                jx0 jx0Var2 = new jx0(2, 1, m42Var);
                jx0Var2.b = ((Boolean) obj).booleanValue();
                return jx0Var2;
            case 2:
                jx0 jx0Var3 = new jx0(2, 2, m42Var);
                jx0Var3.b = ((Boolean) obj).booleanValue();
                return jx0Var3;
            case 3:
                jx0 jx0Var4 = new jx0(2, 3, m42Var);
                jx0Var4.b = ((Boolean) obj).booleanValue();
                return jx0Var4;
            default:
                jx0 jx0Var5 = new jx0(2, 4, m42Var);
                jx0Var5.b = ((Boolean) obj).booleanValue();
                return jx0Var5;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((jx0) create(bool, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((jx0) create(bool, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((jx0) create(bool, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((jx0) create(bool, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((jx0) create(bool, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                hre.r(obj);
                return Boolean.valueOf(!z);
            case 1:
                boolean z2 = this.b;
                hre.r(obj);
                return Boolean.valueOf(z2);
            case 2:
                hre.r(obj);
                return Boolean.valueOf(this.b);
            case 3:
                boolean z3 = this.b;
                hre.r(obj);
                return Boolean.valueOf(z3);
            default:
                boolean z4 = this.b;
                hre.r(obj);
                return Boolean.valueOf(!z4);
        }
    }
}
