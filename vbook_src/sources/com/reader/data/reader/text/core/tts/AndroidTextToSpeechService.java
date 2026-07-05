package com.reader.data.reader.text.core.tts;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.session.MediaSession;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
import java.lang.reflect.Field;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class AndroidTextToSpeechService extends Service {
    public static volatile boolean R;
    public static volatile boolean S;
    public final ye6 C;
    public final ye6 D;
    public final ye6 E;
    public final mfb F;
    public final mfb G;
    public WifiManager.WifiLock H;
    public PowerManager.WakeLock I;
    public tqc J;
    public g50 K;
    public final m41 L;
    public boolean M;
    public final bp9 N;
    public String O;
    public final AndroidTextToSpeechService$becomingNoisyReceiver$1 P;
    public final fo Q;
    public final ye6 a;
    public final ye6 b;
    public final ye6 c;
    public final ye6 d;
    public final ye6 e;
    public final ye6 f;

    /* JADX WARN: Type inference failed for: r0v26, types: [com.reader.data.reader.text.core.tts.AndroidTextToSpeechService$becomingNoisyReceiver$1] */
    public AndroidTextToSpeechService() {
        ko koVar = new ko(this, 0);
        sk6 sk6Var = sk6.a;
        this.a = ipe.x(sk6Var, koVar);
        this.b = ipe.x(sk6Var, new ko(this, 1));
        this.c = ipe.x(sk6Var, new ko(this, 2));
        this.d = ipe.x(sk6Var, new ko(this, 3));
        this.e = ipe.x(sk6Var, new ko(this, 4));
        this.f = ipe.x(sk6Var, new ko(this, 5));
        this.C = ipe.x(sk6Var, new ko(this, 6));
        this.D = ipe.x(sk6Var, new ko(this, 7));
        this.E = ipe.x(sk6Var, new ko(this, 8));
        this.F = new mfb(new vt4(this) { // from class: eo
            public final /* synthetic */ AndroidTextToSpeechService b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                int i = r2;
                AndroidTextToSpeechService androidTextToSpeechService = this.b;
                switch (i) {
                    case 0:
                        boolean z = AndroidTextToSpeechService.R;
                        return new y57(androidTextToSpeechService);
                    default:
                        boolean z2 = AndroidTextToSpeechService.R;
                        return new oo(androidTextToSpeechService, (y57) androidTextToSpeechService.F.getValue());
                }
            }
        });
        this.G = new mfb(new vt4(this) { // from class: eo
            public final /* synthetic */ AndroidTextToSpeechService b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                int i = r2;
                AndroidTextToSpeechService androidTextToSpeechService = this.b;
                switch (i) {
                    case 0:
                        boolean z = AndroidTextToSpeechService.R;
                        return new y57(androidTextToSpeechService);
                    default:
                        boolean z2 = AndroidTextToSpeechService.R;
                        return new oo(androidTextToSpeechService, (y57) androidTextToSpeechService.F.getValue());
                }
            }
        });
        sw2 sw2Var = ab3.a;
        ru2 ru2Var = ru2.c;
        b9b b = rse.b();
        ru2Var.getClass();
        this.L = k27.a(nq2.C(ru2Var, b));
        this.N = new bp9(2);
        this.O = "";
        this.P = new BroadcastReceiver() { // from class: com.reader.data.reader.text.core.tts.AndroidTextToSpeechService$becomingNoisyReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                String str;
                if (intent != null) {
                    str = intent.getAction();
                } else {
                    str = null;
                }
                if ("android.media.AUDIO_BECOMING_NOISY".equals(str)) {
                    AndroidTextToSpeechService androidTextToSpeechService = AndroidTextToSpeechService.this;
                    boolean z = AndroidTextToSpeechService.R;
                    androidTextToSpeechService.g();
                    m41 m41Var = androidTextToSpeechService.L;
                    sw2 sw2Var2 = ab3.a;
                    z87.v(m41Var, ru2.c, null, new go(4, null, androidTextToSpeechService), 2);
                }
            }
        };
        this.Q = new fo(this, 0);
    }

    public static final npc a(AndroidTextToSpeechService androidTextToSpeechService) {
        return (npc) androidTextToSpeechService.C.getValue();
    }

    public static final void b(AndroidTextToSpeechService androidTextToSpeechService) {
        m41 m41Var = androidTextToSpeechService.L;
        sw2 sw2Var = ab3.a;
        z87.v(m41Var, ru2.c, null, new go(6, null, androidTextToSpeechService), 2);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, androidx.media.AudioAttributesCompat] */
    public static final Boolean c(AndroidTextToSpeechService androidTextToSpeechService) {
        fz4 fz4Var;
        y1c y1cVar = ((i2c) androidTextToSpeechService.f()).a;
        if (((Boolean) y1cVar.c.c(y1c.o[2], y1cVar)).booleanValue()) {
            return Boolean.TRUE;
        }
        AudioManager audioManager = (AudioManager) androidTextToSpeechService.getSystemService(AudioManager.class);
        g50 g50Var = androidTextToSpeechService.K;
        if (g50Var == null) {
            int i = g50.e;
            int i2 = AudioAttributesCompat.b;
            if (Build.VERSION.SDK_INT >= 26) {
                fz4Var = new fz4(5);
            } else {
                fz4Var = new fz4(5);
            }
            fz4Var.q0();
            ((AudioAttributes.Builder) fz4Var.a).setContentType(1);
            AudioAttributesImpl c = fz4Var.c();
            ?? obj = new Object();
            obj.a = c;
            fo foVar = androidTextToSpeechService.Q;
            Handler handler = new Handler(Looper.getMainLooper());
            if (foVar != null) {
                g50Var = new g50(foVar, handler, obj);
            } else {
                vs.m("OnAudioFocusChangeListener must not be null");
                return null;
            }
        }
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                h50.w(audioManager, g50Var.a());
            } else {
                audioManager.requestAudioFocus(g50Var.a, g50Var.c.a.a(), 1);
            }
            androidTextToSpeechService.K = g50Var;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public final void d() {
        PowerManager.WakeLock wakeLock = this.I;
        WifiManager.WifiLock wifiLock = null;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                wakeLock = null;
            }
            if (wakeLock != null) {
                wakeLock.acquire(3600000L);
            }
        }
        WifiManager.WifiLock wifiLock2 = this.H;
        if (wifiLock2 != null) {
            if (!wifiLock2.isHeld()) {
                wifiLock = wifiLock2;
            }
            if (wifiLock != null) {
                wifiLock.acquire();
            }
        }
    }

    public final oo e() {
        return (oo) this.G.getValue();
    }

    public final a2c f() {
        return (a2c) this.f.getValue();
    }

    public final void g() {
        PowerManager.WakeLock wakeLock = this.I;
        WifiManager.WifiLock wifiLock = null;
        if (wakeLock != null) {
            if (!wakeLock.isHeld()) {
                wakeLock = null;
            }
            if (wakeLock != null) {
                wakeLock.release();
            }
        }
        WifiManager.WifiLock wifiLock2 = this.H;
        if (wifiLock2 != null) {
            if (wifiLock2.isHeld()) {
                wifiLock = wifiLock2;
            }
            if (wifiLock != null) {
                wifiLock.release();
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        int i = 1;
        R = true;
        ((y57) this.F.getValue()).a.a.setMediaButtonReceiver(null);
        ((y57) this.F.getValue()).a.c(new ho(this), new Handler());
        WifiManager wifiManager = (WifiManager) getSystemService(WifiManager.class);
        if (wifiManager != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                i = 4;
            }
            this.H = wifiManager.createWifiLock(i, "vBook:TextToSpeechServiceWifiLock");
        }
        PowerManager powerManager = (PowerManager) getSystemService(PowerManager.class);
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(536870913, "vBook:TextToSpeechServiceLock");
            this.I = newWakeLock;
            if (newWakeLock != null) {
                newWakeLock.setReferenceCounted(false);
            }
        }
        registerReceiver(this.P, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        z87.v(this.L, null, null, new go(8, null, this), 3);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        MediaPlayer mediaPlayer;
        super.onDestroy();
        R = false;
        S = false;
        AudioManager audioManager = (AudioManager) getSystemService(AudioManager.class);
        g50 g50Var = this.K;
        if (audioManager != null && g50Var != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                h50.a(audioManager, g50Var.a());
            } else {
                audioManager.abandonAudioFocus(g50Var.a);
            }
        }
        this.K = null;
        v57 v57Var = ((y57) this.F.getValue()).a;
        MediaSession mediaSession = v57Var.a;
        v57Var.e.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
            }
        }
        mediaSession.setCallback(null);
        v57Var.b.a.set(null);
        mediaSession.release();
        e().c.b.cancel(null, 10001);
        unregisterReceiver(this.P);
        g();
        bp9 bp9Var = this.N;
        bp9Var.getClass();
        try {
            MediaPlayer mediaPlayer2 = (MediaPlayer) bp9Var.b;
            if (mediaPlayer2 != null && mediaPlayer2.isPlaying() && (mediaPlayer = (MediaPlayer) bp9Var.b) != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer3 = (MediaPlayer) bp9Var.b;
            if (mediaPlayer3 != null) {
                mediaPlayer3.release();
            }
            bp9Var.b = null;
        } catch (Throwable unused) {
        }
        tqc tqcVar = this.J;
        this.J = null;
        sw2 sw2Var = ab3.a;
        z87.v(k27.a(ru2.c), null, null, new l0(tqcVar, null, 17), 3);
        k27.n(this.L, null);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        l0 l0Var = new l0(this, intent, null, 18);
        m41 m41Var = this.L;
        z87.v(m41Var, null, null, l0Var, 3);
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -926488502) {
                if (hashCode == 61915949 && str.equals("com.reader.action.tts.START")) {
                    if (!e().d()) {
                        e().d();
                        stopSelf(i2);
                        return 2;
                    }
                    String stringExtra = intent.getStringExtra("ARGS_BOOK_ID");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    this.O = stringExtra;
                    z87.v(m41Var, null, null, new io(this, intent.getIntExtra("ARGS_CHAPTER_INDEX", 0), intent.getIntExtra("ARGS_CHAR_INDEX", 0), null), 3);
                    return 2;
                }
            } else if (str.equals("com.reader.action.tts.RESUME_LAST_SESSION")) {
                z87.v(m41Var, null, null, new io(i2, null, this), 3);
                return 2;
            }
        }
        e().d();
        stopSelf(i2);
        return 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        stopSelf();
    }
}
