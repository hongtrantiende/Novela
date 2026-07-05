package com.google.mlkit.nl.languageid.bundled.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class ThickLanguageIdentifier {
    public static boolean c;
    public final Context a;
    public long b;

    public ThickLanguageIdentifier(Context context) {
        this.a = context;
    }

    private native void nativeDestroy(long j);

    private native IdentifiedLanguage[] nativeIdentifyPossibleLanguages(long j, byte[] bArr, float f);

    private native long nativeInitFromBuffer(MappedByteBuffer mappedByteBuffer, long j);

    public final ArrayList a(String str, float f) {
        boolean z;
        if (this.b != 0) {
            z = true;
        } else {
            z = false;
        }
        am8.v(z);
        IdentifiedLanguage[] nativeIdentifyPossibleLanguages = nativeIdentifyPossibleLanguages(this.b, str.getBytes(StandardCharsets.UTF_8), f);
        ArrayList arrayList = new ArrayList();
        for (IdentifiedLanguage identifiedLanguage : nativeIdentifyPossibleLanguages) {
            arrayList.add(new IdentifiedLanguage(identifiedLanguage.a, identifiedLanguage.b));
        }
        return arrayList;
    }

    public final void b() {
        boolean z;
        if (this.b == 0) {
            z = true;
        } else {
            z = false;
        }
        am8.v(z);
        synchronized (ThickLanguageIdentifier.class) {
            if (!c) {
                try {
                    System.loadLibrary("language_id_l2c_jni");
                    c = true;
                } catch (UnsatisfiedLinkError e) {
                    throw new vc7("Couldn't load language identification library.", e);
                }
            }
        }
        try {
            AssetFileDescriptor openFd = this.a.getAssets().openFd("tflite_langid.tflite.jpg");
            FileChannel channel = new FileInputStream(openFd.getFileDescriptor()).getChannel();
            try {
                long nativeInitFromBuffer = nativeInitFromBuffer(channel.map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength()), openFd.getDeclaredLength());
                this.b = nativeInitFromBuffer;
                if (nativeInitFromBuffer != 0) {
                    channel.close();
                    openFd.close();
                    return;
                }
                am8.q("Couldn't load language identification model", "Provided message must not be empty.");
                throw new Exception("Couldn't load language identification model");
            } catch (Throwable th) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new vc7("Couldn't open language identification model file", e2);
        }
    }

    public final void c() {
        long j = this.b;
        if (j == 0) {
            return;
        }
        nativeDestroy(j);
        this.b = 0L;
    }
}
