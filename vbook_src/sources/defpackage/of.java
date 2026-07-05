package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: of  reason: default package */
/* loaded from: classes3.dex */
public final class of extends aab implements lu4 {
    public Object C;
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(ymb ymbVar, int i, jwb jwbVar, aw7 aw7Var, aw7 aw7Var2, m42 m42Var) {
        super(2, m42Var);
        this.a = 6;
        this.d = ymbVar;
        this.c = i;
        this.e = jwbVar;
        this.f = aw7Var;
        this.C = aw7Var2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new of((AndroidBookUpdateWorker) this.d, (hk2) this.e, (String) this.f, (nl5) this.C, this.c, m42Var);
            case 1:
                return new of((oh5) this.d, m42Var, (lu4) this.e);
            case 2:
                of ofVar = new of((pm4) this.e, (uo3) this.f, (kj6) this.C, this.c, m42Var);
                ofVar.d = obj;
                return ofVar;
            case 3:
                return new of((i53) this.C, m42Var, 3);
            case 4:
                of ofVar2 = new of((GlanceAppWidgetReceiver) this.e, (Context) this.f, this.c, (Bundle) this.C, m42Var);
                ofVar2.d = obj;
                return ofVar2;
            case 5:
                of ofVar3 = new of((GlanceAppWidgetReceiver) this.e, (Context) this.C, this.c, (String) this.f, m42Var);
                ofVar3.d = obj;
                return ofVar3;
            case 6:
                return new of((ymb) this.d, this.c, (jwb) this.e, (aw7) this.f, (aw7) this.C, m42Var);
            case 7:
                return new of((c0b) this.f, (f0b) this.C, m42Var);
            default:
                of ofVar4 = new of((y5c) this.C, m42Var, 8);
                ofVar4.f = obj;
                return ofVar4;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((of) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((of) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((of) create((yk8) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((of) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((of) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((of) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((of) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((of) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((of) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x03b4, code lost:
        if (r2 == r10) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03c7, code lost:
        if (r2 == r10) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x06cd, code lost:
        if (r0 == r10) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x06f3, code lost:
        if (defpackage.sue.k(r0, r28) != r10) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0712, code lost:
        if (defpackage.sue.k(r1, r28) == r10) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
        if (r3 == r10) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018b, code lost:
        if (r0 == r10) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0223, code lost:
        if (r0 != r10) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:393:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c4 A[LOOP:1: B:71:0x01be->B:73:0x01c4, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x040d -> B:161:0x040f). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 1914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(oh5 oh5Var, m42 m42Var, lu4 lu4Var) {
        super(2, m42Var);
        this.a = 1;
        this.d = oh5Var;
        this.e = lu4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(c0b c0bVar, f0b f0bVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 7;
        this.f = c0bVar;
        this.C = f0bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(pm4 pm4Var, uo3 uo3Var, kj6 kj6Var, int i, m42 m42Var) {
        super(2, m42Var);
        this.a = 2;
        this.e = pm4Var;
        this.f = uo3Var;
        this.C = kj6Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of(rmc rmcVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.C = rmcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(GlanceAppWidgetReceiver glanceAppWidgetReceiver, Context context, int i, Bundle bundle, m42 m42Var) {
        super(2, m42Var);
        this.a = 4;
        this.e = glanceAppWidgetReceiver;
        this.f = context;
        this.c = i;
        this.C = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(GlanceAppWidgetReceiver glanceAppWidgetReceiver, Context context, int i, String str, m42 m42Var) {
        super(2, m42Var);
        this.a = 5;
        this.e = glanceAppWidgetReceiver;
        this.C = context;
        this.c = i;
        this.f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(AndroidBookUpdateWorker androidBookUpdateWorker, hk2 hk2Var, String str, nl5 nl5Var, int i, m42 m42Var) {
        super(2, m42Var);
        this.a = 0;
        this.d = androidBookUpdateWorker;
        this.e = hk2Var;
        this.f = str;
        this.C = nl5Var;
        this.c = i;
    }
}
