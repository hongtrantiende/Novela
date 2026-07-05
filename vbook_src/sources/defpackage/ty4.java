package defpackage;

import android.content.Context;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ty4  reason: default package */
/* loaded from: classes3.dex */
public final class ty4 extends aab implements lu4 {
    public Object C;
    public final /* synthetic */ Object D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Serializable F;
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty4(y5c y5cVar, String str, String str2, m42 m42Var) {
        super(2, m42Var);
        this.D = y5cVar;
        this.E = str;
        this.F = str2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Serializable serializable = this.F;
        Object obj2 = this.D;
        switch (i) {
            case 0:
                ty4 ty4Var = new ty4((GlanceAppWidgetReceiver) this.f, (Context) obj2, (int[]) serializable, m42Var);
                ty4Var.E = obj;
                return ty4Var;
            default:
                return new ty4((y5c) obj2, (String) this.E, (String) serializable, m42Var);
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
                return ((ty4) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ty4) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0181, code lost:
        if (r0 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ab, code lost:
        if (r0 == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0244 -> B:73:0x024a). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ty4(GlanceAppWidgetReceiver glanceAppWidgetReceiver, Context context, int[] iArr, m42 m42Var) {
        super(2, m42Var);
        this.f = glanceAppWidgetReceiver;
        this.D = context;
        this.F = iArr;
    }
}
