package defpackage;

import android.speech.tts.UtteranceProgressListener;
import java.util.HashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vn  reason: default package */
/* loaded from: classes.dex */
public final class vn extends UtteranceProgressListener {
    public final /* synthetic */ co a;

    public vn(co coVar) {
        this.a = coVar;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        co coVar = this.a;
        HashSet hashSet = coVar.l;
        if (sl1.W(hashSet, str)) {
            jsc.r(hashSet).remove(str);
            coVar.g++;
            coVar.n = 0;
            if (coVar.h) {
                coVar.l();
            }
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        co coVar = this.a;
        HashSet hashSet = coVar.l;
        if (sl1.W(hashSet, str)) {
            jsc.r(hashSet).remove(str);
            int i = coVar.n + 1;
            coVar.n = i;
            if (i < 3) {
                if (coVar.h) {
                    coVar.l();
                    return;
                }
                return;
            }
            rwa rwaVar = coVar.b;
            if (rwaVar != null) {
                ((bp9) rwaVar.c).q(2, "");
            }
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
    }
}
