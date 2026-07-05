package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@Deprecated
/* loaded from: classes3.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(byte[] bArr) {
        return new cyc(ByteBuffer.wrap(bArr, 0, bArr.length).slice());
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new eyc(new k57(parcelFileDescriptor, 13));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new cyc(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new cyc(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static UploadDataProvider create(File file) {
        return new eyc(new bp9(file, 8));
    }
}
