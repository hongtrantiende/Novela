package com.reader.app.widget.tts;

import android.content.Context;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class TTSNextChapterAction implements l5, p96 {
    public static final int $stable = 8;
    private final ye6 playerController$delegate = ipe.x(sk6.a, new vm(this, 3));

    private final wpc getPlayerController() {
        return (wpc) this.playerController$delegate.getValue();
    }

    @Override // defpackage.p96
    public /* bridge */ m96 getKoin() {
        return super.getKoin();
    }

    @Override // defpackage.l5
    public Object onAction(Context context, uy4 uy4Var, r5 r5Var, m42 m42Var) {
        wpc playerController = getPlayerController();
        playerController.getClass();
        boolean z = AndroidTextToSpeechService.R;
        if (AndroidTextToSpeechService.R) {
            mfb mfbVar = ix3.a;
            ix3.a(hzb.a);
        } else {
            playerController.b();
        }
        return pvc.a;
    }
}
