package defpackage;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: af  reason: default package */
/* loaded from: classes.dex */
public final class af {
    public ry8 b;
    public vt4 c;
    public final MediaPlayer a = new MediaPlayer();
    public float d = 1.0f;
    public float e = 1.0f;

    public final boolean a() {
        Object gs9Var;
        try {
            gs9Var = Boolean.valueOf(this.a.isPlaying());
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        Object obj = Boolean.FALSE;
        if (gs9Var instanceof gs9) {
            gs9Var = obj;
        }
        return ((Boolean) gs9Var).booleanValue();
    }

    public final void b() {
        ry8 ry8Var = this.b;
        if (ry8Var != null) {
            ry8Var.c(qy8.a);
        }
        PlaybackParams speed = new PlaybackParams().setPitch(this.e).setSpeed(this.d);
        MediaPlayer mediaPlayer = this.a;
        mediaPlayer.setPlaybackParams(speed);
        mediaPlayer.prepare();
    }

    public final void c(ig2 ig2Var) {
        MediaPlayer mediaPlayer = this.a;
        mediaPlayer.reset();
        if (ig2Var instanceof m01) {
            mediaPlayer.setDataSource(new p01(((m01) ig2Var).a));
        } else if (ig2Var instanceof nyc) {
            mediaPlayer.setDataSource(((nyc) ig2Var).a);
        }
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: ye
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                vt4 vt4Var = af.this.c;
                if (vt4Var != null) {
                    vt4Var.invoke();
                    return true;
                }
                return true;
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ze
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                ry8 ry8Var = af.this.b;
                if (ry8Var != null) {
                    ry8Var.c(qy8.c);
                }
            }
        });
    }

    public final void d() {
        ry8 ry8Var = this.b;
        if (ry8Var != null) {
            ry8Var.c(qy8.b);
        }
        boolean a = a();
        MediaPlayer mediaPlayer = this.a;
        if (a) {
            mediaPlayer.stop();
            mediaPlayer.reset();
        }
        mediaPlayer.start();
    }

    public final void e() {
        if (a()) {
            this.a.stop();
        }
    }
}
