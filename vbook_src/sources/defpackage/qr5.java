package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qr5  reason: default package */
/* loaded from: classes3.dex */
public final class qr5 extends aab implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ byte[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qr5(byte[] bArr, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.b = bArr;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        int i = this.a;
        byte[] bArr = this.b;
        switch (i) {
            case 0:
                return new qr5(bArr, m42Var, 0);
            case 1:
                return new qr5(bArr, m42Var, 1);
            case 2:
                return new qr5(bArr, m42Var, 2);
            case 3:
                return new qr5(bArr, m42Var, 3);
            default:
                return new qr5(bArr, m42Var, 4);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                hre.r(pvcVar);
                return ((qr5) create(m42Var)).b;
            case 1:
                hre.r(pvcVar);
                return ((qr5) create(m42Var)).b;
            case 2:
                hre.r(pvcVar);
                return ((qr5) create(m42Var)).b;
            case 3:
                return ((qr5) create(m42Var)).invokeSuspend(pvcVar);
            default:
                return ((qr5) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        byte[] bArr = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                return bArr;
            case 1:
                hre.r(obj);
                return bArr;
            case 2:
                hre.r(obj);
                return bArr;
            case 3:
                hre.r(obj);
                return bArr;
            default:
                hre.r(obj);
                return bArr;
        }
    }
}
