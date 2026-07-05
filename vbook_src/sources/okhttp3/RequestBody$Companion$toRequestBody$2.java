package okhttp3;

import java.io.FileDescriptor;
import java.io.FileInputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {
    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final boolean d() {
        return true;
    }

    @Override // okhttp3.RequestBody
    public final void e(az0 az0Var) {
        az0Var.getClass();
        FileInputStream fileInputStream = new FileInputStream((FileDescriptor) null);
        try {
            az0Var.b().J(tl1.K(fileInputStream));
            fileInputStream.close();
        } finally {
        }
    }
}
