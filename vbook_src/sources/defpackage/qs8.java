package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qs8  reason: default package */
/* loaded from: classes3.dex */
public final class qs8 extends aab implements lu4 {
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a = 1;
    public int b;
    public /* synthetic */ Object c;
    public int d;
    public int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs8(ps psVar, List list, int i, int i2, oyb oybVar, nn nnVar, m42 m42Var) {
        super(2, m42Var);
        this.f = psVar;
        this.C = list;
        this.d = i;
        this.e = i2;
        this.D = oybVar;
        this.E = nnVar;
    }

    public static final void o(ps psVar, List list, ArrayList arrayList, m82 m82Var, int i, int i2, oyb oybVar, nn nnVar, int i3, int i4) {
        ps subSequence = psVar.subSequence(i3, i4);
        List e0 = g9a.e0(new ki4(3, new ff4(sl1.V(list), true, new pp5(i3, i4, 3)), new tr0(i3, 17)));
        if (i4 - i3 == 1) {
            List e = subSequence.e(0, subSequence.b.length(), "androidx.compose.foundation.text.inlineContent");
            if (!e.isEmpty()) {
                arrayList.add(z87.s(m82Var, null, new p4c(e, i3, i4, i, i2, null, 2), 3));
                return;
            }
        }
        arrayList.add(z87.s(m82Var, null, new jg1(subSequence, oybVar, nnVar, e0, i3, i4, i, (m42) null), 3));
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                qs8 qs8Var = new qs8((ss8) this.D, (String) this.E, m42Var);
                qs8Var.c = obj;
                return qs8Var;
            default:
                qs8 qs8Var2 = new qs8((ps) this.f, (List) this.C, this.d, this.e, (oyb) this.D, (nn) this.E, m42Var);
                qs8Var2.c = obj;
                return qs8Var2;
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
                return ((qs8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((qs8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0234 A[LOOP:2: B:71:0x0234->B:76:0x0260, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0273  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v7, types: [xl9] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0143 -> B:54:0x0147). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qs8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs8(ss8 ss8Var, String str, m42 m42Var) {
        super(2, m42Var);
        this.D = ss8Var;
        this.E = str;
    }
}
