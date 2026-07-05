package defpackage;

import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mo  reason: default package */
/* loaded from: classes3.dex */
public final class mo extends aab implements lu4 {
    public final /* synthetic */ int a = 2;
    public int b;
    public int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(int i, String str, int i2, int i3, m42 m42Var) {
        super(2, m42Var);
        this.b = i;
        this.e = str;
        this.c = i2;
        this.d = i3;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new mo((AndroidTextToSpeechService) obj2, this.b, this.c, this.d, m42Var);
            case 1:
                return new mo(this.d, m42Var, (ur5) obj2);
            default:
                return new mo(this.b, (String) obj2, this.c, this.d, m42Var);
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
                ((mo) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                return ((mo) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((mo) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103 A[LOOP:0: B:43:0x0103->B:44:0x011a, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(int i, m42 m42Var, ur5 ur5Var) {
        super(2, m42Var);
        this.e = ur5Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(AndroidTextToSpeechService androidTextToSpeechService, int i, int i2, int i3, m42 m42Var) {
        super(2, m42Var);
        this.e = androidTextToSpeechService;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
