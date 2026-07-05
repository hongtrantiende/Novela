package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d47  reason: default package */
/* loaded from: classes.dex */
public interface d47 {
    void a();

    void b(Bundle bundle);

    void c(int i, nd2 nd2Var, long j, int i2);

    void d(int i, int i2, int i3, long j);

    void e(int i);

    default void f(ex2 ex2Var) {
        ex2Var.run();
    }

    void flush();

    MediaFormat g();

    void h();

    void i(int i, long j);

    int j();

    int k(MediaCodec.BufferInfo bufferInfo);

    void l(int i);

    ByteBuffer m(int i);

    void n(Surface surface);

    default boolean o(mce mceVar) {
        return false;
    }

    ByteBuffer p(int i);

    void q(ArrayList arrayList);

    void r(t47 t47Var, Handler handler);

    void s(ArrayList arrayList);
}
