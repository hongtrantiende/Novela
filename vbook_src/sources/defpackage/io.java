package defpackage;

import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: io  reason: default package */
/* loaded from: classes3.dex */
public final class io extends aab implements lu4 {
    public final /* synthetic */ int a = 1;
    public int b;
    public final /* synthetic */ AndroidTextToSpeechService c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io(AndroidTextToSpeechService androidTextToSpeechService, int i, int i2, m42 m42Var) {
        super(2, m42Var);
        this.c = androidTextToSpeechService;
        this.b = i;
        this.d = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        int i2 = this.d;
        AndroidTextToSpeechService androidTextToSpeechService = this.c;
        switch (i) {
            case 0:
                return new io(androidTextToSpeechService, this.b, i2, m42Var);
            default:
                return new io(i2, m42Var, androidTextToSpeechService);
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
                ((io) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                return ((io) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r14 == r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
        if (r14 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        if (r14 == r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
        return r5;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io(int i, m42 m42Var, AndroidTextToSpeechService androidTextToSpeechService) {
        super(2, m42Var);
        this.c = androidTextToSpeechService;
        this.d = i;
    }
}
