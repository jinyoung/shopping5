package shopping.external;

import org.springframework.stereotype.Service;

@Service
public class PointAccumulationServiceImpl implements PointAccumulationService {

    /**
     * Fallback
     */
    public PointAccumulation getPointAccumulation(Long id) {
        PointAccumulation pointAccumulation = new PointAccumulation();
        return pointAccumulation;
    }
}
