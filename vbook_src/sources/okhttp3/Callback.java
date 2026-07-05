package okhttp3;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public interface Callback {
    void d(Call call, Response response);

    void e(Call call, IOException iOException);
}
