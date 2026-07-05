package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eyc  reason: default package */
/* loaded from: classes3.dex */
public final class eyc extends UploadDataProvider {
    public volatile FileChannel a;
    public final dyc b;
    public final Object c = new Object();

    public eyc(dyc dycVar) {
        this.b = dycVar;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileChannel fileChannel = this.a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return o().size();
    }

    public final FileChannel o() {
        if (this.a == null) {
            synchronized (this.c) {
                try {
                    if (this.a == null) {
                        this.a = this.b.p();
                    }
                } finally {
                }
            }
        }
        return this.a;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            FileChannel o = o();
            int i = 0;
            while (i == 0) {
                int read = o.read(byteBuffer);
                if (read == -1) {
                    break;
                }
                i += read;
            }
            uploadDataSink.onReadSucceeded(false);
            return;
        }
        vs.k("Cronet passed a buffer with no bytes remaining");
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        o().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
