package defpackage;

import com.reader.piper.PiperNcnn;
import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pn0  reason: default package */
/* loaded from: classes3.dex */
public final class pn0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ double e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pn0(s26 s26Var, int[] iArr, int i, double d, m42 m42Var) {
        super(2, m42Var);
        this.a = 2;
        this.c = s26Var;
        this.d = iArr;
        this.b = i;
        this.e = d;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Serializable serializable = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new pn0((sn0) obj2, (String) serializable, this.e, m42Var, 0);
            case 1:
                return new pn0((sn0) obj2, (String) serializable, this.e, m42Var, 1);
            default:
                return new pn0((s26) obj2, (int[]) serializable, this.b, this.e, m42Var);
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
                return ((pn0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((pn0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((pn0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        n82 n82Var = n82.a;
        double d = this.e;
        Serializable serializable = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                di2 di2Var = ((sn0) obj2).a;
                String str = (String) serializable;
                this.b = 1;
                str.getClass();
                Object C = z1d.C(z1d.A(new rh2(di2Var.a.getData(), str, d)), this);
                if (C == n82Var) {
                    return n82Var;
                }
                return C;
            case 1:
                int i3 = this.b;
                pvc pvcVar = pvc.a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    di2 di2Var2 = ((sn0) obj2).a;
                    this.b = 1;
                    Object o = y9e.o(di2Var2.a, new bi2((String) serializable, d, null), this);
                    if (o != n82Var) {
                        o = pvcVar;
                    }
                    if (o == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            default:
                hre.r(obj);
                return ((PiperNcnn) ((s26) obj2).b).synthesizeFromIds((int[]) serializable, this.b, d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn0(sn0 sn0Var, String str, double d, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = sn0Var;
        this.d = str;
        this.e = d;
    }
}
