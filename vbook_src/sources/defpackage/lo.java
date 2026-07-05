package defpackage;

import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lo  reason: default package */
/* loaded from: classes.dex */
public final class lo extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidTextToSpeechService b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lo(int i, m42 m42Var, AndroidTextToSpeechService androidTextToSpeechService) {
        super(2, m42Var);
        this.a = i;
        this.b = androidTextToSpeechService;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new lo(0, m42Var, this.b);
            case 1:
                return new lo(1, m42Var, this.b);
            case 2:
                return new lo(2, m42Var, this.b);
            default:
                return new lo(3, m42Var, this.b);
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
                ((lo) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((lo) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((lo) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((lo) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                hre.r(obj);
                AndroidTextToSpeechService androidTextToSpeechService = this.b;
                boolean z = AndroidTextToSpeechService.R;
                androidTextToSpeechService.e().f();
                return pvc.a;
            case 1:
                hre.r(obj);
                AndroidTextToSpeechService androidTextToSpeechService2 = this.b;
                boolean z2 = AndroidTextToSpeechService.R;
                androidTextToSpeechService2.e().f();
                return pvc.a;
            case 2:
                hre.r(obj);
                AndroidTextToSpeechService androidTextToSpeechService3 = this.b;
                boolean z3 = AndroidTextToSpeechService.R;
                oo e = androidTextToSpeechService3.e();
                synchronized (e.c()) {
                    e.e(e.c(), 3);
                    e.c.a(10001, e.c().b());
                }
                return pvc.a;
            default:
                hre.r(obj);
                AndroidTextToSpeechService androidTextToSpeechService4 = this.b;
                boolean z4 = AndroidTextToSpeechService.R;
                androidTextToSpeechService4.e().f();
                return pvc.a;
        }
    }
}
