package defpackage;

import android.media.AudioManager;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fo  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fo implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fo(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                AndroidTextToSpeechService androidTextToSpeechService = (AndroidTextToSpeechService) obj;
                m41 m41Var = androidTextToSpeechService.L;
                boolean z = AndroidTextToSpeechService.R;
                if (i != -2 && i != -1) {
                    if ((i == 1 || i == 2) && androidTextToSpeechService.M) {
                        androidTextToSpeechService.d();
                        sw2 sw2Var = ab3.a;
                        z87.v(m41Var, ru2.c, null, new go(9, null, androidTextToSpeechService), 2);
                        return;
                    }
                    return;
                }
                androidTextToSpeechService.g();
                sw2 sw2Var2 = ab3.a;
                z87.v(m41Var, ru2.c, null, new go(5, null, androidTextToSpeechService), 2);
                return;
            default:
                a50 a50Var = (a50) obj;
                a50Var.getClass();
                if (i != -3 && i != -2) {
                    if (i != -1) {
                        if (i != 1) {
                            a82.y("Unknown focus change type: ", "AudioFocusManager", i);
                            return;
                        }
                        a50Var.b(2);
                        q04 q04Var = a50Var.c;
                        if (q04Var != null) {
                            ggb ggbVar = q04Var.D;
                            ggbVar.getClass();
                            fgb c = ggb.c();
                            c.a = ggbVar.a.obtainMessage(33, 1, 0);
                            c.b();
                            return;
                        }
                        return;
                    }
                    q04 q04Var2 = a50Var.c;
                    if (q04Var2 != null) {
                        ggb ggbVar2 = q04Var2.D;
                        ggbVar2.getClass();
                        fgb c2 = ggb.c();
                        c2.a = ggbVar2.a.obtainMessage(33, -1, 0);
                        c2.b();
                    }
                    a50Var.a();
                    a50Var.b(1);
                    return;
                } else if (i != -2) {
                    a50Var.b(4);
                    return;
                } else {
                    q04 q04Var3 = a50Var.c;
                    if (q04Var3 != null) {
                        ggb ggbVar3 = q04Var3.D;
                        ggbVar3.getClass();
                        fgb c3 = ggb.c();
                        c3.a = ggbVar3.a.obtainMessage(33, 0, 0);
                        c3.b();
                    }
                    a50Var.b(3);
                    return;
                }
        }
    }
}
