package defpackage;

import android.view.textclassifier.TextClassifier;
import androidx.glance.session.SessionWorker;
import java.util.List;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z38  reason: default package */
/* loaded from: classes3.dex */
public final class z38 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z38(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                z38 z38Var = new z38((ta1) obj2, m42Var, 0);
                z38Var.c = obj;
                return z38Var;
            case 1:
                return new z38((t58) this.c, (String) obj2, m42Var, 1);
            case 2:
                z38 z38Var2 = new z38((qf8) obj2, m42Var, 2);
                z38Var2.c = obj;
                return z38Var2;
            case 3:
                z38 z38Var3 = new z38((rf8) obj2, m42Var, 3);
                z38Var3.c = obj;
                return z38Var3;
            case 4:
                return new z38((pj1) this.c, (String) obj2, m42Var, 4);
            case 5:
                z38 z38Var4 = new z38((dt8) this.c, (aw7) obj2, m42Var, 5);
                z38Var4.b = ((Number) obj).intValue();
                return z38Var4;
            case 6:
                return new z38((TextClassifier) this.c, (lu4) obj2, m42Var, 6);
            case 7:
                return new z38((r59) this.c, (String) obj2, m42Var, 7);
            case 8:
                z38 z38Var5 = new z38((zb9) obj2, m42Var, 8);
                z38Var5.c = obj;
                return z38Var5;
            case 9:
                return new z38((mc9) this.c, (List) obj2, m42Var, 9);
            case 10:
                return new z38((be9) this.c, (f76) obj2, m42Var, 10);
            case 11:
                return new z38((rj9) this.c, (jp5) obj2, m42Var, 11);
            case 12:
                z38 z38Var6 = new z38((mn9) obj2, m42Var, 12);
                z38Var6.c = obj;
                return z38Var6;
            case 13:
                return new z38((rl) this.c, (xr) obj2, m42Var, 13);
            case 14:
                z38 z38Var7 = new z38((rl) obj2, m42Var, 14);
                z38Var7.c = obj;
                return z38Var7;
            case 15:
                return new z38((lx9) this.c, (ix9) obj2, m42Var, 15);
            case 16:
                return new z38((List) obj2, m42Var, 16);
            case 17:
                return new z38((th3) this.c, (w2a) obj2, m42Var, 17);
            case 18:
                return new z38((pj1) this.c, (ps) obj2, m42Var, 18);
            case 19:
                return new z38((zu0) this.c, (zl9) obj2, m42Var, 19);
            case 20:
                z38 z38Var8 = new z38((ey) obj2, m42Var, 20);
                z38Var8.c = obj;
                return z38Var8;
            case 21:
                return new z38((SessionWorker) this.c, (ey) obj2, m42Var, 21);
            case 22:
                z38 z38Var9 = new z38((SessionWorker) obj2, m42Var, 22);
                z38Var9.c = obj;
                return z38Var9;
            case 23:
                z38 z38Var10 = new z38((zfa) obj2, m42Var, 23);
                z38Var10.c = obj;
                return z38Var10;
            case 24:
                return new z38((jga) this.c, (gxa) obj2, m42Var, 24);
            case 25:
                return new z38((eha) this.c, (vaa) obj2, m42Var, 25);
            case 26:
                return new z38((gia) this.c, (List) obj2, m42Var, 26);
            case 27:
                z38 z38Var11 = new z38((lia) obj2, m42Var, 27);
                z38Var11.c = obj;
                return z38Var11;
            case 28:
                return new z38((yja) this.c, (zja) obj2, m42Var, 28);
            default:
                return new z38((oaa) obj2, m42Var, 29);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((z38) create((bod) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((z38) create((bod) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                ((z38) create(Integer.valueOf(((Number) obj).intValue()), (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 6:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((z38) create((JSONObject) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 18:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 19:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 20:
                return ((z38) create((kba) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 21:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 22:
                return ((z38) create((jac) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 23:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 24:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 25:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 26:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 27:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 28:
                ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return n82.a;
            default:
                return ((z38) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
        if (r1 != r10) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r0.invoke(r1, r26) == r10) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:?, code lost:
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011e, code lost:
        if (r0 == r10) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017a, code lost:
        if (r0.a(r9, r26) == r10) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c2, code lost:
        r8 = r10;
        r1 = r1;
        r2 = r2;
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:529:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [w26] */
    /* JADX WARN: Type inference failed for: r1v3, types: [w26] */
    /* JADX WARN: Type inference failed for: r1v59, types: [bha] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r2v61, types: [dba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [m82, m41] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006f -> B:20:0x0073). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x01c2 -> B:454:0x01c3). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 2294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z38.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z38(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
    }
}
