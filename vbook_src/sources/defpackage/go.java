package defpackage;

import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: go  reason: default package */
/* loaded from: classes3.dex */
public final class go extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ AndroidTextToSpeechService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go(int i, m42 m42Var, AndroidTextToSpeechService androidTextToSpeechService) {
        super(2, m42Var);
        this.a = i;
        this.c = androidTextToSpeechService;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        AndroidTextToSpeechService androidTextToSpeechService = this.c;
        switch (i) {
            case 0:
                return new go(0, m42Var, androidTextToSpeechService);
            case 1:
                return new go(1, m42Var, androidTextToSpeechService);
            case 2:
                return new go(2, m42Var, androidTextToSpeechService);
            case 3:
                return new go(3, m42Var, androidTextToSpeechService);
            case 4:
                return new go(4, m42Var, androidTextToSpeechService);
            case 5:
                return new go(5, m42Var, androidTextToSpeechService);
            case 6:
                return new go(6, m42Var, androidTextToSpeechService);
            case 7:
                return new go(7, m42Var, androidTextToSpeechService);
            case 8:
                return new go(8, m42Var, androidTextToSpeechService);
            case 9:
                return new go(9, m42Var, androidTextToSpeechService);
            default:
                return new go(10, m42Var, androidTextToSpeechService);
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
                return ((go) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((go) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((go) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((go) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((go) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((go) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 6:
                return ((go) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 7:
                return ((go) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 8:
                return ((go) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 9:
                return ((go) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((go) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (com.reader.data.reader.text.core.tts.AndroidTextToSpeechService.c(r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
        if (r10 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0159, code lost:
        if (r10 == r1) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0170, code lost:
        if (r10 == r1) goto L102;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
