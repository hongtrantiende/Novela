package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cb  reason: default package */
/* loaded from: classes3.dex */
public final class cb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ eb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb(eb ebVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = ebVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        eb ebVar = this.c;
        switch (i) {
            case 0:
                return new cb(ebVar, m42Var, 0);
            default:
                return new cb(ebVar, m42Var, 1);
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
                return ((cb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((cb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        eb ebVar = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                ka kaVar = (ka) ebVar.c;
                kaVar.getClass();
                xa1 xa1Var = new xa1(new da(kaVar, (m42) null, 0), gs3.a, -2, py0.a);
                bb bbVar = new bb(ebVar, 0);
                this.b = 1;
                if (xa1Var.a(bbVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
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
                ka kaVar2 = (ka) ebVar.c;
                gk2 gk2Var = kaVar2.a.b;
                gk2Var.getClass();
                fk2 fk2Var = fk2.a;
                mm mmVar = (mm) gk2Var.a;
                ck2 ck2Var = new ck2(gk2Var, 1);
                mmVar.getClass();
                s02 O = v9e.O(new xla(-1015933738, new String[]{"DbAiTtsModel"}, mmVar, "DbAiTtsModel.sq", "getAll", "SELECT DbAiTtsModel.id, DbAiTtsModel.name, DbAiTtsModel.language, DbAiTtsModel.sampleRate, DbAiTtsModel.numSpeakers, DbAiTtsModel.speakers, DbAiTtsModel.sizeBytes, DbAiTtsModel.gender, DbAiTtsModel.modelType, DbAiTtsModel.modelFormat, DbAiTtsModel.createAt, DbAiTtsModel.updateAt\nFROM DbAiTtsModel\nORDER BY createAt DESC", ck2Var));
                sw2 sw2Var = ab3.a;
                ja jaVar = new ja(0, v9e.z(O, ru2.c), kaVar2);
                db dbVar = new db(ebVar, null, 0);
                this.b = 1;
                if (z1d.v(jaVar, dbVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
