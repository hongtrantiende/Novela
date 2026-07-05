package defpackage;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f50  reason: default package */
/* loaded from: classes.dex */
public final class f50 {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final l40 d;
    public final Object e;

    public f50(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, l40 l40Var, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = l40Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.b = new d50(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.e = new AudioFocusRequest.Builder(i).setAudioAttributes(l40Var.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z).build();
        } else {
            this.e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f50) {
                f50 f50Var = (f50) obj;
                if (this.a == f50Var.a && Objects.equals(this.b, f50Var.b) && Objects.equals(this.c, f50Var.c) && Objects.equals(this.d, f50Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.FALSE);
    }
}
