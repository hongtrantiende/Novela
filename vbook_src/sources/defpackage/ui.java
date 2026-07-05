package defpackage;

import android.view.View;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ui  reason: default package */
/* loaded from: classes3.dex */
public final class ui extends fs9 implements lu4 {
    public final /* synthetic */ int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.b = i;
        this.e = obj;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.b;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ui uiVar = new ui((wi) obj2, m42Var, 0);
                uiVar.d = obj;
                return uiVar;
            case 1:
                ui uiVar2 = new ui((np6) obj2, m42Var, 1);
                uiVar2.d = obj;
                return uiVar2;
            case 2:
                ui uiVar3 = new ui((lu4) obj2, m42Var, 2);
                uiVar3.d = obj;
                return uiVar3;
            case 3:
                ui uiVar4 = new ui((ytb) obj2, m42Var, 3);
                uiVar4.d = obj;
                return uiVar4;
            default:
                ui uiVar5 = new ui((View) obj2, m42Var, 4);
                uiVar5.d = obj;
                return uiVar5;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((ui) create((gab) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((ui) create((gab) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((ui) create((gab) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                ((ui) create((gab) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return n82.a;
            default:
                return ((ui) create((c9a) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0090 -> B:29:0x0093). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0147 -> B:58:0x014b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01d5 -> B:89:0x01d9). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
