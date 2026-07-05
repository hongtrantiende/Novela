package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f8c  reason: default package */
/* loaded from: classes.dex */
public final class f8c extends aab implements mu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ tj4 c;
    public /* synthetic */ Object[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f8c(int i, int i2, m42 m42Var) {
        super(i, m42Var);
        this.a = i2;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        tj4 tj4Var = (tj4) obj;
        Object[] objArr = (Object[]) obj2;
        m42 m42Var = (m42) obj3;
        switch (i) {
            case 0:
                f8c f8cVar = new f8c(3, 0, m42Var);
                f8cVar.c = tj4Var;
                f8cVar.d = objArr;
                return f8cVar.invokeSuspend(pvcVar);
            case 1:
                f8c f8cVar2 = new f8c(3, 1, m42Var);
                f8cVar2.c = tj4Var;
                f8cVar2.d = objArr;
                return f8cVar2.invokeSuspend(pvcVar);
            default:
                f8c f8cVar3 = new f8c(3, 2, m42Var);
                f8cVar3.c = tj4Var;
                f8cVar3.d = objArr;
                return f8cVar3.invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        d12 d12Var;
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = 0;
        n82 n82Var = n82.a;
        d12 d12Var2 = null;
        switch (i) {
            case 0:
                tj4 tj4Var = this.c;
                Object[] objArr = this.d;
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                Object obj2 = objArr[0];
                obj2.getClass();
                pz9 pz9Var = (pz9) obj2;
                Object obj3 = objArr[1];
                obj3.getClass();
                long j = ((zy5) obj3).a;
                Object obj4 = objArr[2];
                obj4.getClass();
                float floatValue = ((Float) obj4).floatValue();
                Object obj5 = objArr[3];
                obj5.getClass();
                boolean booleanValue = ((Boolean) obj5).booleanValue();
                Object obj6 = objArr[4];
                obj6.getClass();
                Object obj7 = objArr[5];
                obj7.getClass();
                int intValue = ((Integer) obj7).intValue();
                uy5 uy5Var = pz9Var.a;
                if (((cd6) obj6).a()) {
                    floatValue = pz9Var.b;
                }
                qz9 qz9Var = new qz9(booleanValue, uy5Var, j, floatValue, intValue);
                this.c = null;
                this.d = null;
                this.b = 1;
                if (tj4Var.b(qz9Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
                tj4 tj4Var2 = this.c;
                Object[] objArr2 = this.d;
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                Object obj8 = objArr2[0];
                Object obj9 = objArr2[1];
                Object obj10 = objArr2[2];
                Object obj11 = objArr2[3];
                Object obj12 = objArr2[4];
                StringBuilder sb = new StringBuilder();
                sb.append(obj8);
                sb.append(obj9);
                sb.append(obj10);
                sb.append(obj11);
                sb.append(obj12);
                String sb2 = sb.toString();
                this.c = null;
                this.d = null;
                this.b = 1;
                if (tj4Var2.b(sb2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                tj4 tj4Var3 = this.c;
                d12[] d12VarArr = (d12[]) this.d;
                int length = d12VarArr.length;
                while (true) {
                    d12Var = b12.a;
                    if (i2 < length) {
                        d12 d12Var3 = d12VarArr[i2];
                        if (!c16.i(d12Var3, d12Var)) {
                            d12Var2 = d12Var3;
                        } else {
                            i2++;
                        }
                    }
                }
                if (d12Var2 != null) {
                    d12Var = d12Var2;
                }
                this.b = 1;
                if (tj4Var3.b(d12Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
