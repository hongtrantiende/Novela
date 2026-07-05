package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import okhttp3.RequestBody;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: up9  reason: default package */
/* loaded from: classes3.dex */
public final class up9 extends UploadDataProvider {
    public volatile boolean a = false;
    public final my0 b = new Object();
    public final /* synthetic */ long c;
    public final /* synthetic */ RequestBody d;

    /* JADX WARN: Type inference failed for: r1v2, types: [my0, java.lang.Object] */
    public up9(bl8 bl8Var, long j, RequestBody requestBody) {
        this.c = j;
        this.d = requestBody;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.c;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!this.a) {
            this.d.e(this.b);
            this.b.getClass();
            this.a = true;
            long j = this.c;
            long j2 = this.b.b;
            if (j2 != j) {
                StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + String.valueOf(j).length() + 24);
                sb.append("Expected ");
                sb.append(j);
                sb.append(" bytes but got ");
                sb.append(j2);
                throw new IOException(sb.toString());
            }
        }
        if (this.b.read(byteBuffer) != -1) {
            uploadDataSink.onReadSucceeded(false);
        } else {
            vs.k("The source has been exhausted but we expected more!");
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindError(new UnsupportedOperationException());
    }
}
