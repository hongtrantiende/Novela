package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d  reason: default package */
/* loaded from: classes.dex */
public final class d extends fs9 implements lu4 {
    public final /* synthetic */ int b;
    public int c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.b = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.b;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                d dVar = new d((pe4) this.e, (hn8) obj2, m42Var, 0);
                dVar.d = obj;
                return dVar;
            case 1:
                d dVar2 = new d((d82) this.e, (lu4) obj2, m42Var, 1);
                dVar2.d = obj;
                return dVar2;
            case 2:
                d dVar3 = new d((zl9) this.e, (zg4) obj2, m42Var, 2);
                dVar3.d = obj;
                return dVar3;
            case 3:
                d dVar4 = new d((npb) obj2, m42Var, 3);
                dVar4.d = obj;
                return dVar4;
            case 4:
                d dVar5 = new d((aw7) obj2, m42Var, 4);
                dVar5.d = obj;
                return dVar5;
            case 5:
                d dVar6 = new d((vt4) obj2, m42Var, 5);
                dVar6.e = obj;
                return dVar6;
            case 6:
                d dVar7 = new d((f7a) this.e, (j6a) obj2, m42Var, 6);
                dVar7.d = obj;
                return dVar7;
            case 7:
                d dVar8 = new d((s09) this.e, (zl9) obj2, m42Var, 7);
                dVar8.d = obj;
                return dVar8;
            default:
                d dVar9 = new d((i3c) obj2, m42Var, 8);
                dVar9.d = obj;
                return dVar9;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((d) create((c9a) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((d) create((gab) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((d) create((gab) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((d) create((gab) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((d) create((gab) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((d) create((c9a) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((d) create((gab) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((d) create((gab) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((d) create((gab) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0462 A[Catch: CancellationException -> 0x0449, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0449, blocks: (B:221:0x0462, B:224:0x0471, B:210:0x0445, B:215:0x0450), top: B:246:0x042a }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x016f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Type inference failed for: r0v12, types: [lu4] */
    /* JADX WARN: Type inference failed for: r4v0, types: [s09] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [gab, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0212 -> B:102:0x0213). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x02c5 -> B:141:0x02c8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x035a -> B:168:0x035e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:225:0x0479 -> B:219:0x045c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:230:0x048a -> B:219:0x045c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0144 -> B:58:0x0147). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.b = i;
        this.f = obj;
    }
}
