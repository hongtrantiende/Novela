package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media.AudioAttributesCompat;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g50  reason: default package */
/* loaded from: classes.dex */
public final class g50 {
    public static final /* synthetic */ int e = 0;
    public final AudioManager.OnAudioFocusChangeListener a;
    public final Handler b;
    public final AudioAttributesCompat c;
    public final Object d;

    static {
        fz4 fz4Var;
        int i = AudioAttributesCompat.b;
        if (Build.VERSION.SDK_INT >= 26) {
            fz4Var = new fz4(5);
        } else {
            fz4Var = new fz4(5);
        }
        fz4Var.q0();
        fz4Var.c();
    }

    public g50(fo foVar, Handler handler, AudioAttributesCompat audioAttributesCompat) {
        this.b = handler;
        this.c = audioAttributesCompat;
        int i = Build.VERSION.SDK_INT;
        if (i < 26 && handler.getLooper() != Looper.getMainLooper()) {
            this.a = new e50(foVar, handler);
        } else {
            this.a = foVar;
        }
        if (i >= 26) {
            this.d = ay5.b((AudioAttributes) audioAttributesCompat.a.b(), this.a, handler);
        } else {
            this.d = null;
        }
    }

    public final AudioFocusRequest a() {
        return vs.d(this.d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g50) {
                g50 g50Var = (g50) obj;
                if (Objects.equals(this.a, g50Var.a) && this.b.equals(g50Var.b) && this.c.equals(g50Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(1, this.a, this.b, this.c, Boolean.FALSE);
    }
}
